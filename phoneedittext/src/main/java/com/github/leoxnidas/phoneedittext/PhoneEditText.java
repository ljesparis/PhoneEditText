/*
    Copyright 2017 Leonardo Javier Esparis Meza

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.github.leoxnidas.phoneedittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;


public class PhoneEditText extends EditText {

    private final int p_mDefaultCode = Codes.USA;

    private int p_mCode;
    private String p_mCodeStr;
    private String PLUS = "+";

    public PhoneEditText(Context context) {
        super(context);
        initialize();
        setCode(p_mDefaultCode);
    }

    public PhoneEditText(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.editTextStyle);
    }

    public PhoneEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
        initPhoneEditText(attrs);
    }

    private void initialize() {
        // no matter what kind of input type developer will use
        // always, phone input type shall be used.
        setInputType(-1);
        addTextChangedListener(null);
        setSingleLine(true);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(14)});
    }

    private void initPhoneEditText (AttributeSet attrs) {
        TypedArray typedArray = getContext().getTheme()
                .obtainStyledAttributes(attrs, R.styleable.PhoneEditText, 0, 0);

        try {
            p_mCode = typedArray.getInt(R.styleable.PhoneEditText_code, p_mDefaultCode);
        } finally {
            typedArray.recycle();
        }

        setCode(p_mCode);
    }

    public void setCode(int code) {
        if(Codes.isCodeValid(code)) {
            p_mCode = code;
            p_mCodeStr = Codes.asString(code);

            if(getText().toString().length() > p_mCodeStr.length())
                setText((PLUS + p_mCodeStr));
            else
                setHint((PLUS + p_mCodeStr));

            Selection.setSelection(getText(), getText().toString().length());
        } else {
            throw new RuntimeException("International code does not exists.");
        }
    }

    public int getCode() {
        return p_mCode;
    }

    @Override
    public void setInputType(int type) {
        super.setInputType(InputType.TYPE_CLASS_PHONE);
    }

    @Override
    public void addTextChangedListener(TextWatcher watcher) {
        super.addTextChangedListener(new PhoneEditTextWatcher());
    }

    private class PhoneEditTextWatcher implements TextWatcher {

        private int p_mLastLenght = 0;

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String currentText = s.toString();
            int currentLength = currentText.length();

            String code = PLUS + p_mCodeStr;
            int codeLength = code.length();

            if(currentLength < codeLength && p_mLastLenght == 0) {
                setText((code + s));
            } else {
                try {
                    for(int i = 0; i < codeLength; i++) {
                        if(currentText.charAt(i) != code.charAt(i)) {
                            String nCode = code;

                            for(int j = codeLength + 1; j < currentLength; j++) {
                                nCode += Character.toString(currentText.charAt(j));
                            }

                            setText(nCode);
                            Selection.setSelection(getText(), i);
                            break;
                        }
                    }
                } catch (StringIndexOutOfBoundsException ignored) {

                }
            }
        }

        @Override
        public void afterTextChanged(Editable s) {
            if(s.length() == (PLUS + p_mCodeStr).length() - 1
                    && p_mLastLenght > (PLUS + p_mCodeStr).length() - 1)
                setText("");

            if(p_mLastLenght <= (PLUS + p_mCodeStr).length())
                Selection.setSelection(getText(), getText().length());

            p_mLastLenght = getText().length();
        }
    }

}


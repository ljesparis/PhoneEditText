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

    private int p_mCode;
    private String p_mCodeStr;
    private String PLUS = "+";

    public PhoneEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPhoneEditText(attrs);

        // no matter what kind of input type developer will use
        // always, phone input type shall be used.
        setInputType(-1);
        addTextChangedListener(null);
        setText((PLUS + Codes.asString(p_mCode)));
    }

    private void initPhoneEditText (AttributeSet attrs) {
        TypedArray typedArray = getContext().getTheme()
                .obtainStyledAttributes(attrs, R.styleable.PhoneEditText, 0, 0);

        try {
            p_mCode = typedArray.getInt(R.styleable.PhoneEditText_code, -1);
        } finally {
            typedArray.recycle();
        }

        if(p_mCode == -1)
            setCode(Codes.USA);

        setCode(p_mCode);
    }

    public void setCode(int code) {
        if(Codes.isCodeValid(code)) {
            p_mCode = code;
            p_mCodeStr = Codes.asString(code);
            setText((PLUS + p_mCodeStr));
            setSingleLine(true);
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(14)});
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

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {}

        @Override
        public void afterTextChanged(Editable s) {
            if(s.length() < (1 + p_mCodeStr.length()))
                setText((PLUS + p_mCodeStr));
            Selection.setSelection(s, s.length());
        }
    }

}

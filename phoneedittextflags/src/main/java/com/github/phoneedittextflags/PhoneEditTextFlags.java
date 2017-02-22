package com.github.phoneedittextflags;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.Spinner;


public class PhoneEditTextFlags extends RelativeLayout {

    private Spinner p_mCountryFlags;
    private PhoneEditText p_mPhoneEditText;

    public PhoneEditTextFlags(Context context) {
        super(context);
        init();
    }

    public PhoneEditTextFlags(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PhoneEditTextFlags(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.phone_edit_text_flags, this);
        p_mCountryFlags = (Spinner) findViewById(R.id.countryflags);
        p_mPhoneEditText = (PhoneEditText) findViewById(R.id.phoneedittext);
    }
}

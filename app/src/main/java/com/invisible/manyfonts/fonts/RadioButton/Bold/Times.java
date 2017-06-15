package com.invisible.manyfonts.fonts.RadioButton.Bold;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by mind on 7/6/17.
 */

public class Times extends RadioButton {

    public Times(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Times(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Times(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Typography Times Bold.ttf");
        setTypeface(tf);

    }


}

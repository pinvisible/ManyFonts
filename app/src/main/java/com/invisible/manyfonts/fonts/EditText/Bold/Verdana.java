package com.invisible.manyfonts.fonts.EditText.Bold;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by mind on 7/6/17.
 */

public class Verdana extends EditText {

    public Verdana(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Verdana(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Verdana(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/verdanab.ttf");
        setTypeface(tf);

    }


}

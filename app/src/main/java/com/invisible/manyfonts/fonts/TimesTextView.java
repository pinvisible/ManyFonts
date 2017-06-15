package com.invisible.manyfonts.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by mind on 7/6/17.
 */

public class TimesTextView extends TextView {

    public TimesTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TimesTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TimesTextView(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Typography Times Regular.ttf");
        setTypeface(tf);

    }


}

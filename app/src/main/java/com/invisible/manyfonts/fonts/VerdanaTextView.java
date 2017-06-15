package com.invisible.manyfonts.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by mind on 7/6/17.
 */

public class VerdanaTextView extends TextView {

    public VerdanaTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public VerdanaTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VerdanaTextView(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/verdana.ttf");
        setTypeface(tf);

    }


}

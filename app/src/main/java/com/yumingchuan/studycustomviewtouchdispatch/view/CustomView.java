package com.yumingchuan.studycustomviewtouchdispatch.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by yumingchuan on 2017/5/4.
 */

public class CustomView extends View {


    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.i("customView", "CustomView----->>dispatchTouchEvent::       " + ev.getAction());

        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("customView", "CustomView----->>onTouchEvent::       " + event.getAction());
        return super.onTouchEvent(event);
    }


}

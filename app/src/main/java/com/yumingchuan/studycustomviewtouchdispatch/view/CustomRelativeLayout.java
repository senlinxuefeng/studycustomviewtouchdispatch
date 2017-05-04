package com.yumingchuan.studycustomviewtouchdispatch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by yumingchuan on 2017/5/4.
 */

public class CustomRelativeLayout extends RelativeLayout {
    public CustomRelativeLayout(Context context) {
        super(context);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.i("customView", "CustomRelativeLayout----->>dispatchTouchEvent::       " + ev.getAction());

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("customView", "CustomRelativeLayout----->>onInterceptTouchEvent::       " + ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("customView", "CustomRelativeLayout----->>onTouchEvent::       " + event.getAction());
        return super.onTouchEvent(event);
    }
}

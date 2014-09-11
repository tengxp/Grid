package com.example.GridTest;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.open.lib.util.AppLog;

/**
 * Created by showmo on 2014/8/25.
 */
public class TestViewGroup extends ViewGroup {
    protected final AppLog mLog = AppLog.getInstance(this);

    public TestViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        mLog.i("onLayout");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        mLog.i("onMeasure");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        mLog.i("dispatchDraw");
        super.dispatchDraw(canvas);
    }

    @Override
    protected boolean setFrame(int left, int top, int right, int bottom) {
        mLog.i("setFrame");
        return super.setFrame(left, top, right, bottom);
    }

    @Override
    protected void onFinishInflate() {
        mLog.i("onFinishInflate");
        super.onFinishInflate();
    }

    @Override
    public void onStartTemporaryDetach() {
        mLog.i("onStartTemporaryDetach");
        super.onStartTemporaryDetach();
    }

    @Override
    protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        mLog.i("onRequestFocusInDescendants");
        return super.onRequestFocusInDescendants(direction, previouslyFocusedRect);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        mLog.i("onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        mLog.i("onFocusChanged");
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        mLog.i("onWindowFocusChanged");
        super.onWindowFocusChanged(hasWindowFocus);
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        mLog.i("onWindowVisibilityChanged");
        super.onWindowVisibilityChanged(visibility);
    }

    @Override
    protected void onDisplayHint(int hint) {
        mLog.i("onDisplayHint");
        super.onDisplayHint(hint);
    }

    @Override
    protected void onVisibilityChanged(View changedView, int visibility) {
        mLog.i("onVisibilityChanged");
        super.onVisibilityChanged(changedView, visibility);
    }

    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        mLog.i("onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        mLog.i("onScrollChanged");
        super.onScrollChanged(l, t, oldl, oldt);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        mLog.i("onSizeChanged");
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mLog.i("onDraw");
        super.onDraw(canvas);
    }

    @Override
    protected void onAttachedToWindow() {
        mLog.i("onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        mLog.i("onDetachedFromWindow");
        super.onDetachedFromWindow();
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        mLog.i("onSaveInstanceState");
        return super.onSaveInstanceState();
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        mLog.i("onRestoreInstanceState");
        super.onRestoreInstanceState(state);
    }

    @Override
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        mLog.i("onOverScrolled");
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
    }
}

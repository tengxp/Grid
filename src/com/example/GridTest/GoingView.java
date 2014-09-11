package com.example.GridTest;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by showmo on 14-9-11.
 */
public class GoingView extends TestViewGroup {
    private boolean mInLayout;

    public GoingView(Context context, AttributeSet attrs) {
        super(context, attrs);

        new GridView(mContext);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);

        mInLayout = true;
        if (changed) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).forceLayout();
            }
            //mRecycler.markChildrenDirty();
        }

        layoutChildren();
        mInLayout = false;
    }

    private void layoutChildren() {

    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}

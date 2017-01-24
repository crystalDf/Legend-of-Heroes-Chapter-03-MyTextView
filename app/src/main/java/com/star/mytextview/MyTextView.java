package com.star.mytextview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.TextView;


public class MyTextView extends TextView {

    private Paint mPaint1;
    private Paint mPaint2;

    public MyTextView(Context context) {
        super(context);

        init(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context);
    }

    private void init(Context context) {

        mPaint1 = new Paint();
        mPaint1.setColor(ContextCompat.getColor(context, android.R.color.holo_blue_light));
        mPaint1.setStyle(Paint.Style.FILL);

        mPaint2 = new Paint();
        mPaint2.setColor(Color.YELLOW);
        mPaint2.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), mPaint1);
        canvas.drawRect(10, 10, getMeasuredWidth() - 10, getMeasuredHeight() - 10, mPaint2);

        canvas.save();
        canvas.translate(10, 0);

        super.onDraw(canvas);

        canvas.restore();
    }

}

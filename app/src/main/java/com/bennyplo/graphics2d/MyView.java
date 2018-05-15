package com.bennyplo.graphics2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by benlo on 09/05/2018.
 */

public class MyView extends View {
    private Paint redPaint;


    public MyView(Context context) {
        super(context, null);
        //Add your initialisation code here
        redPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        redPaint.setStyle(Paint.Style.STROKE);//stroke only no fill
        redPaint.setColor(0xffff0000);//color red
        redPaint.setStrokeWidth(5);//set the line stroke width to 5
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Add your drawing code here
        canvas.drawRect(10,30,200,200,redPaint);
    }
}

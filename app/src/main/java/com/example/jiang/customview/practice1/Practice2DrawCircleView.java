package com.example.jiang.customview.practice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(150,100,100,paint);


        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(150,400,100,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(150,700,100,paint);


        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(150,1000,100,paint);
    }
}

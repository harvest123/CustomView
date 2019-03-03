package com.example.jiang.customview.practice1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DDrawRectView extends View {
    public Practice3DDrawRectView(Context context) {
        super(context);
    }

    public Practice3DDrawRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DDrawRectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        canvas.drawRect(100, 100, 200, 300, paint);
    }
}

package com.example.audakel.templematch;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


    public class practiceTempleImageView extends ImageView
    {

        /**
         * @param context
         */
        public practiceTempleImageView(Context context)
        {
            super(context);
            // TODO Auto-generated constructor stub
            setBackgroundColor(0xFFFFFF);
        }


        public practiceTempleImageView(Context context, AttributeSet attrs, int defStyle)
        {
            super(context, attrs, defStyle);
            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onDraw(Canvas canvas)
        {
            // TODO Auto-generated method stub
            super.onDraw(canvas);
            System.out.println("Painting content");
            Paint paint  = new Paint(Paint.LINEAR_TEXT_FLAG);
            paint.setColor(0x0);
            paint.setTextSize(12.0F);
            System.out.println("Drawing text");
            canvas.drawText("Hello World in custom view", 100, 100, paint);
        }

    }

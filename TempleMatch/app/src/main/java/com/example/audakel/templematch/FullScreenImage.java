package com.example.audakel.templematch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;


public class FullScreenImage extends Activity {

//    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        setContentView(R.layout.full_image);
////        Intent intent = getIntent();
////        int imageId = intent.getExtras().get(Practice.class.getName());
////        ImageView imageView = (ImageView)findViewById(R.id.fullImage);
////
////        imageView.setLayoutParams( new ViewGroup.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT));
////
////        imageView.setImageResource(imageId);
////        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
////
////    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.full_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

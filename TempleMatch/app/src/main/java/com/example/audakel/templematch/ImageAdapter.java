package com.example.audakel.templematch;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

/**
 * Created by audakel on 10/17/14.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        TextView textView;

        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(375,275));

            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //imageView.setPadding(10,10,10,10);

        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        int id = mThumbIds[position];
        imageView.setId(id);

        return imageView;
    }

    // references to our images
    Integer[] mThumbIds = TemplePicNameArray.orderedTempleList;
}

//        if (convertView == null) {  // if it's not recycled, initialize some attributes
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(375,275));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            //imageView.setPadding(10,10,10,10);
//
////            textView = new TextView(mContext);
////            textView.setLayoutParams(new GridView.LayoutParams(85, 85));
////            textView.setText("Temple");
////            textView.setTextColor(Color.WHITE);
////            textView.setPadding(8, 8, 8, 8);
//
//        } else {
//            imageView = (ImageView) convertView;
//        }
//
//        imageView.setImageResource(mThumbIds[position]);
//        int id = mThumbIds[position];
//        imageView.setId(id);
//
//        return imageView;
//    }


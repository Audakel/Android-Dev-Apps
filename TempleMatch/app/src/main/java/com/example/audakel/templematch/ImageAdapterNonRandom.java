package com.example.audakel.templematch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by audakel on 10/17/14.
 */
public class ImageAdapterNonRandom extends BaseAdapter {

private Context mContext;

    public ImageAdapterNonRandom(Context c) {
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
        ImageView imageView = null;
        TextView textView;
        View view = null;
        View MyView = convertView;

        if (MyView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            MyView = mInflater.inflate(R.layout.activity_practice_temple_image_view, parent, false);

            imageView = (ImageView) view.findViewById(R.id.myImageView);
            textView = (TextView) view.findViewById(R.id.myImageViewText);

            // imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(375,275));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

            textView.setText("Temple");
        }


        //getThumbIds();

        imageView.setImageResource(mThumbIds[position]);
        int id = mThumbIds[position];
        imageView.setId(id);

        return MyView;
    }

    // references to our images

Integer[] mThumbIds = TemplePicNameArray.orderedTempleList;

    private void getThumbIds() {
        mThumbIds = Game.returnTempleUpdateIntArray;
    }
}
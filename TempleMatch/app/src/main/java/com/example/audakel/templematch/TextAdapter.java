package com.example.audakel.templematch;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

/**
 * Created by audakel on 10/17/14.
 */
public class TextAdapter extends BaseAdapter {

    private Context context;

    public TextAdapter(Context context) {
        this.context = context;
    }

    public int getCount() {
        return templeNames.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if (convertView == null) {
            textView = new TextView(context);
            //textView.setLayoutParams(new GridView.LayoutParams(85, 85));
            textView.setTextColor(Color.RED);
            textView.setPadding(2,8,2,8);
            textView.setTextSize(15);

        }
        else {
            textView = (TextView) convertView;
        }

        textView.setText(templeNames[position]);
        return textView;
    }
    static String[] templeNames = {
            "Aba Nigeria",
            "Accra Ghana",
            "Albuquerque New Mexico",
            "Anchorage Alaska",
            "Apia Samoa",
            "Asunción Paraguay",
            "Atlanta Georgia",
            "Baton Rouge Louisiana",
            "Bern Switzerland",
            "Billings Montana",
            "Birmingham Alabama",
            "Bismarck North Dakota",
            "Bogotá Colombia",
            "Boise Idaho",
            "Boston Massachusetts",
            "Bountiful Utah",
            "Brigham City Utah",
            "Brisbane Australia",
            "Buenos Aires Argentina",
            "Calgary Alberta",
            "Campinas Brazil",
            "Cardston Alberta",
            "Cebu City Philippines",
            "Chicago Illinois",
            "Ciudad Juárez Mexico",
            "Colonia Juárez ",
            "Columbia River Washington",
            "Columbia South Carolina",
            "Copenhagen Denmark",
            "Córdoba Argentina",
            "Curitiba Brazil",
            "Dallas Texas",
            "Denver Colorado",
            "Detroit Michigan",
            "Draper Utah",
            "Helsinki Finland",
            "Kyiv Ukraine",
            "Laie Hawaii",
            "Madrid Spain",
            "Mexico City Mexico",

};

}

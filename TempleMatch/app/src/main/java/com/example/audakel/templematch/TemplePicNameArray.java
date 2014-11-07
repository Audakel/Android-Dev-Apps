package com.example.audakel.templematch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by audakel on 10/17/14.
 */
public class TemplePicNameArray {

    public static Integer[] randomizeTemplePictures() {
        Integer[] randomizedTemplePictures = new Integer[orderedTempleList.length];
        Random random = new Random();

        for (int i = 0; i < orderedTempleList.length; i++) {
            int randomInt = random.nextInt(orderedTempleList.length);
            randomizedTemplePictures[i] = orderedTempleList[randomInt];
        }

        return randomizedTemplePictures;
    }

    public static ArrayList<Integer> randomizeTemplePictures2() {
        ArrayList<Integer> randomTempleList = new ArrayList<Integer>();
        for (int i = 0; i < orderedTempleList.length; i++) {
            randomTempleList.add(orderedTempleList[i]);
        }
        Collections.shuffle(randomTempleList);

        return randomTempleList;
    }


    public static HashMap<Integer, String> getTempleNameIdMap(){
        HashMap<Integer, String> templeNameIdMap = new HashMap<Integer, String>();

        for (int i = 0; i < orderedTempleList.length; i++) {
            templeNameIdMap.put(orderedTempleList[i], templeNames[i]);
        }

        return templeNameIdMap;
    }

    public static  Integer[] orderedTempleList = {
            R.drawable.aba,
            R.drawable.accra,
            R.drawable.albuquerque,
            R.drawable.anchorage,
            R.drawable.apia,
            R.drawable.asuncion,
            R.drawable.atlanta,
            R.drawable.baton,
            R.drawable.bern,
            R.drawable.billings,
            R.drawable.birmingham,
            R.drawable.bismarck,
            R.drawable.bogota,
            R.drawable.boise,
            R.drawable.boston,
            R.drawable.bountiful,
            R.drawable.brigham,
            R.drawable.brisbane,
            R.drawable.buenos,
            R.drawable.calgary,
            R.drawable.campinas,
            R.drawable.cardston,
            R.drawable.cebu,
            R.drawable.chicago,
            R.drawable.ciudad,
            R.drawable.colonia,
            R.drawable.columbia,
            R.drawable.copenhagen,
            R.drawable.cordoba,
            R.drawable.curitiba,
            R.drawable.dallas,
            R.drawable.denver,
            R.drawable.detroit,
            R.drawable.draper,
            R.drawable.helsinki,
            R.drawable.kyiv,
            R.drawable.hawaii,
            R.drawable.madrid,
            R.drawable.mexico
    };

    public static  String[] templeNames = {
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

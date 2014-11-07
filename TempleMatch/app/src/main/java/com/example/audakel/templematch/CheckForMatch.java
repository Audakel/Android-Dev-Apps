package com.example.audakel.templematch;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by audakel on 10/19/14.
 */
public class CheckForMatch {

    CheckForMatch(){};

    static String checkForMatch(String templePictureGuess, String templeNameGuess){
        String message = "";

        if (templePictureGuess != "" && templeNameGuess != ""){

            if (templeNameGuess.equals(templePictureGuess)){
                message = templeNameGuess + " matches " + templePictureGuess;
                templePictureGuess = "";
                templeNameGuess = "";
            }
            else {
                message = "Error: " + templeNameGuess + " does not match " + templePictureGuess;
                templePictureGuess = "";
                templeNameGuess = "";
            }
        }

        return message;
    }
}

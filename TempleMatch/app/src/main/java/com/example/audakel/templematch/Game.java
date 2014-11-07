package com.example.audakel.templematch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class Game extends Activity {

    private String templePictureGuess = "";
    private String templeNameGuess = "";
    private String matchMessage = "";
    private int score = 0;
    private int badScore = 0;
    private HashMap<Integer, String> templeNameIdHashMap = TemplePicNameArray.getTempleNameIdMap();
    private TextView matchView;
    private Integer toRemovePicID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        matchView = (TextView) findViewById(R.id.textMatchVeiw);
        final TextView scoreView = (TextView) findViewById(R.id.scoreView);

        GridView gridView = (GridView) findViewById(R.id.gameGridView);
        gridView.setAdapter(new ImageAdapter(this));

        ListView listView2 = (ListView) findViewById(R.id.listView2);
        listView2.setAdapter(new TextAdapter(this));
        // gridView.setAdapter(new TextAdapter(this));


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                int pictureId = v.getId();
                templePictureGuess = templeNameIdHashMap.get(pictureId);
                matchMessage = checkForMatch(templePictureGuess, templeNameGuess);
                toRemovePicID = pictureId;

                if (!matchMessage.equals("")){
                    matchView.setText(matchMessage);
                    scoreView.setText("Good: " + score + "  Bad: " + badScore);
                }

            }
        });

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                templeNameGuess = TextAdapter.templeNames[position];
                matchMessage = checkForMatch(templePictureGuess, templeNameGuess);

                if (!matchMessage.equals("")){
                    //Toast.makeText(Game.this, matchMessage, Toast.LENGTH_SHORT).show();
                    matchView.setText(matchMessage);
                    scoreView.setText("Good: " + score + "  Bad: " + badScore);
                }
            }
        });

        Button practiceButton = (Button) findViewById(R.id.practiceButton);
        practiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Game.this, Practice.class);
                startActivity(intent);
            }
        });

        Button resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Game.this, Game.class);
                startActivity(intent);
            }
        });
    }


    String checkForMatch(String pictureGuess, String nameGuess){
        String message = "";

        if (pictureGuess != "" && nameGuess != ""){

            if (nameGuess.equals(pictureGuess)){
                message = nameGuess + " matches!";
                mThumbIds.remove(toRemovePicID);
                returnTempleUpdate();
                templePictureGuess = "";
                templeNameGuess= "";

                score++;
            }
            else {
                message =  nameGuess + " does not match :(";
                templePictureGuess = "";
                templeNameGuess= "";
                badScore++;

            }
        }

        return message;
    }

    public static ArrayList<Integer> mThumbIds = TemplePicNameArray.randomizeTemplePictures2();

    public static Integer[] returnTempleUpdate(){
        Integer[] randomizedTemplePictures = new Integer[mThumbIds.size()];
        for (int i = 0; i < mThumbIds.size(); i++) {
            int item = mThumbIds.get(i);
            randomizedTemplePictures[i] = item;
        }

        return randomizedTemplePictures;
    }

    public static Integer[] returnTempleUpdateIntArray = returnTempleUpdate();




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game, menu);
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

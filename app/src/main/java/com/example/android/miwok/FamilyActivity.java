package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<String> restaurantsToTry = new ArrayList<String>();
        restaurantsToTry.add("Morning Cafe");
        restaurantsToTry.add("BBQ Time");
        restaurantsToTry.remove("Morning Cafe");
        int numberOfRestaurants = restaurantsToTry.size();
/**
 * New ArrayList is Created
 * ArrayList is a Generic Class meaning we need to give the type of list inside "<>"
 * There is a type simple_list_item in arraylist but it displays only one textview
 * In our case we plan to have two text views with an image view
 * so we create a class called Word and use it in ArrayList type
 *
 */

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("fahther", "әpә"));
        words.add(new Word("mother", "әṭa"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("older brother", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "tete"));
        words.add(new Word("younger sister", "kolliti"));
        words.add(new Word("grandmother", "ama"));
        words.add(new Word("grandfather", "paapa"));
/**
 * Now we are done with the ArrayList
 * We need to Display the list
 * We plan to use Display Adapter -memory efficient method
 * we define a new adapter called itemsAdapter
 * Refer to adapter documentation, adapter needs a constructor defined,we use (context , resource ) as constructor
 * instead of using ArrayAdapter we are creating a class called WordAdapter to override
 */


        WordAdapter itemsAdapter = new WordAdapter(this, words);

        /**
         * Listview is called and adapter is defined (set)
         */

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }

}

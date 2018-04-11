package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
/**
 * New ArrayList is Created
 * ArrayList is a Generic Class meaning we need to give the type of list inside "<>"
 * There is a type simple_list_item in arraylist but it displays only one textview
 * In our case we plan to have two text views with an image view
 * so we create a class called Word and use it in ArrayList type
 *
 */

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiko"));
        words.add(new Word("three", "tolockosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massoka"));
        words.add(new Word("six", "temmoka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));
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
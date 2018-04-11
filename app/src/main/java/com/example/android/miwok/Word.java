package com.example.android.miwok;

/**
 * Created by PRAKASH on 10-04-2018.
 */

import android.content.Context;
import android.view.View;

/**
 * Create a new class Word
 */
public class Word {

    /**
     * Define the state of the Class
     * We need this class for displaying two text views and an image view
     * we define Default translation as member variable , because we dont want any other class to use this
     */
    private String mDefaultTranslation;

//define the state Miwok Translation

    private String mMiwakTranslation;

// Now we define the constructor for the class

    public Word(String defaultTranslation, String miwakTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwakTranslation = miwakTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwak translation of the word
     */
    public String getmMiwakTranslation() {
        return mMiwakTranslation;
    }

}


package com.santor.game;

import android.app.Activity;
import android.os.Bundle;

/**
 * Окно, в котором будет формироваться игра
 */
public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
    }
}

package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "App up and running");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity", "App is logged out");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MainActivity", "App is started");

    }
}
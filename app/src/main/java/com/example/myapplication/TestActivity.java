package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TestActivity extends AppCompatActivity {

    private static final String Tag = "Practical2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        GetParsedArgs();
    }
    private void GetParsedArgs()
    {
        String Argument = getIntent().getStringExtra(MainActivity.Key);
        Log.d(Tag, Argument);
    }

}
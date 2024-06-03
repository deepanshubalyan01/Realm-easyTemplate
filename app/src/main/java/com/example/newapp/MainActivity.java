package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.realm.mongodb.App;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App app = new App("your app id");


    }
}
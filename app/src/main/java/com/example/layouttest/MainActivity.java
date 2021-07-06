package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View v){
        Intent intent= new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
    public void registerActivity(View v){
        Intent intent= new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}
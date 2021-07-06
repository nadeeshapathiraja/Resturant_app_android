package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void nextActivity(View v){
        Intent intent= new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }
    public void newOrder(View v){
        Intent intent= new Intent(this,NewOrderActivity.class);
        startActivity(intent);
    }
    public void pastOrder(View v){
        Intent intent= new Intent(this,PastOrderActivity.class);
        startActivity(intent);
    }
}
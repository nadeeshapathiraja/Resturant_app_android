package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    EditText edName,edEmail,edMobile,edAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        edName = findViewById(R.id.name);
        edEmail = findViewById(R.id.email);
        edMobile = findViewById(R.id.mobile);
        edAddress = findViewById(R.id.address);
    }

    public void clear(View v){
        edName.setText("");
        edEmail.setText("");
        edMobile.setText("");
        edAddress.setText("");
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences profile =getSharedPreferences("profile",MODE_PRIVATE);

    //Get data in stroge
        String name =profile.getString("NAME","");
        String email =profile.getString("EMAIL","");
        String mobile =profile.getString("MOBILE","");
        String address =profile.getString("ADDRESS","");

        //set data
        edName.setText(name);
        edEmail.setText(email);
        edMobile.setText(mobile);
        edAddress.setText(address);
    }

    public void save(View v){
        //Get data to new variables
        String name = edName.getText().toString();
        String email = edEmail.getText().toString();
        String mobile = edMobile.getText().toString();
        String address = edAddress.getText().toString();

        //Start shared preferences
        SharedPreferences profile =getSharedPreferences("profile",MODE_PRIVATE);
        SharedPreferences.Editor editor =profile.edit();

        //Store Data
        editor.putString("NAME",name);
        editor.putString("EMAIL",email);
        editor.putString("MOBILE",mobile);
        editor.putString("ADDRESS",address);

        //save data
        editor.commit();
        
        //Display user
        Toast.makeText(this, "Save Data Successfull", Toast.LENGTH_SHORT).show();
    }

    public void myNote(View v){
        Intent intent = new Intent(this,MyNoteActivity.class);
        startActivity(intent);
    }
}
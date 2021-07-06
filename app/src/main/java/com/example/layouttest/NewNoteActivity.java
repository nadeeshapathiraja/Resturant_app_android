package com.example.layouttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
    }

    public void save(View v){
        EditText newNote = findViewById(R.id.noteText);
        String text = newNote.getText().toString();


        try {


            SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
            String name = sdf.format(new Date());
            String fileName = getFilesDir()+ File.separator +name+".txt";

            FileOutputStream fos= new FileOutputStream(fileName);


            fos.write(text.getBytes());
            fos.close();//For save file
            //send message to user
            Toast.makeText(this, "Note Save Successfully", Toast.LENGTH_SHORT).show();

        }catch (Exception exception){
            //print exception in logcat
            exception.printStackTrace();

            //Send message  to user
            Toast.makeText(this, "Error: Failed to save File", Toast.LENGTH_LONG).show();
        }
    }
}
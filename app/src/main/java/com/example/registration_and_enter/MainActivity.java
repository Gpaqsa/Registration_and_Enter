package com.example.registration_and_enter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public  final static String EXTRA_MESSAGE = "com.example.registration_and_enter.message";

    public void SingUpbtn(View view){

        Intent  SingUpIntent = new Intent(this, ThirdActivity.class);

        startActivity(SingUpIntent);
    }

    public void LogInbtn(View view){

        Intent LogInIntent = new Intent(this, SecondActivity.class);
        LogInIntent.putExtra("message", "Hello User");
        LogInIntent.putExtra(EXTRA_MESSAGE, "Hello User");
        startActivity(LogInIntent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

}
package com.example.registration_and_enter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public void SingUpbtn(View view){

        Intent SingUpIntent = new Intent(this, ThirdActivity.class);

        startActivity(SingUpIntent);
    }

    public void onBack(View view){
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent receivedIntent = getIntent();

        String message = receivedIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView =(TextView)findViewById(R.id.textViewLOGIN);
        textView.setText(message);
    }
}
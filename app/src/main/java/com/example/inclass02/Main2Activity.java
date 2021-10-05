package com.example.inclass02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String uName = intent.getStringExtra("USERN");
        String pWd = intent.getStringExtra("PWD");
        TextView tv = (TextView) findViewById(R.id.secondTxtView);
        tv.setText("welcome USerName ");

    }
}

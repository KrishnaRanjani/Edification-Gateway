package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qualtw_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualtw_home);
        Button sci;
        sci= findViewById(R.id.Science);
        sci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(),sciquallist.class);
                startActivity(in1);
            }
        });
        Button artee;
        artee= findViewById(R.id.Art);
        artee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(),artquallist.class);
                startActivity(in2);
            }
        });
        Button comerce;
        comerce= findViewById(R.id.Commerce);
        comerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(),comquallist.class);
                startActivity(in3);
            }
        });
    }
}

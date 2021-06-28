package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qualiten_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualiten_home);
        Button HSCC;
        HSCC= findViewById(R.id.HSC);
        HSCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(),hsc.class);
                startActivity(in1);
            }
        });
        Button dipo;
       dipo= findViewById(R.id.diploma);
       dipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(),dipolmaa.class);
                startActivity(in2);
            }
        });
        Button def;
        def= findViewById(R.id.defense);
       def.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(),defense_list.class);
                startActivity(in3);
            }
        });
    }
}

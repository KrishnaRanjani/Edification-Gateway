package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clg_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clg_home);

        Button enginer = findViewById(R.id.engineering);
        enginer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(),eng.class);
                startActivity(in1);
            }
        });
        Button doc = findViewById(R.id.medicine);
        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(),medi.class);
                startActivity(in2);
            }
        });
        Button laws = findViewById(R.id.law);
        laws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(),lawclg.class);
                startActivity(in3);
            }
        });
        Button art = findViewById(R.id.arts);
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(getApplicationContext(),artclg.class);
                startActivity(in4);
            }
        });

    }
}

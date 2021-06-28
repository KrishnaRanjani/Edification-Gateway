package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sciquallist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sciquallist);
        Button scigg;
        scigg=(Button)findViewById(R.id.eng_qual);
        scigg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(),englist.class);
                startActivity(in1);
            }
        });
        Button sciggg;
        sciggg=(Button)findViewById(R.id.medical_qual);
        sciggg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(),medical_list.class);
                startActivity(in2);
            }
        });
        Button scigggg;
        scigggg=(Button)findViewById(R.id.defense_qual);
        scigggg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(),defense_list.class);
                startActivity(in3);
            }
        });
    }
}

package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class eng80 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng80);
        TextView li80=(TextView)findViewById(R.id.link80);
        li80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e3 = new Intent(getApplicationContext(),eng.class);
                startActivity(e3);
            }
        });
    }
}

package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class eng5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng5);
        TextView li5=(TextView)findViewById(R.id.link5);
        li5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e5 = new Intent(getApplicationContext(),eng.class);
                startActivity(e5);
            }
        });
    }
}

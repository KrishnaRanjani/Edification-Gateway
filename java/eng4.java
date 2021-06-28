package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class eng4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng4);
        TextView li4=(TextView)findViewById(R.id.link4);
        li4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e4 = new Intent(getApplicationContext(),eng.class);
                startActivity(e4);
            }
        });
    }
}

package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class eng2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng2);
        TextView li2=(TextView)findViewById(R.id.link2);
        li2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e2 = new Intent(getApplicationContext(),eng.class);
                startActivity(e2);
            }
        });
    }
}

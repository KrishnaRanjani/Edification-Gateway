package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class eng1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng1);
        TextView li1=(TextView)findViewById(R.id.link1);
        li1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e1 = new Intent(getApplicationContext(),eng.class);
                startActivity(e1);
            }
        });
    }
}

package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class med16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med16);
        TextView m16=(TextView)findViewById(R.id.me16);
        m16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e3 = new Intent(getApplicationContext(),medi.class);
                startActivity(e3);
            }
        });
    }
}

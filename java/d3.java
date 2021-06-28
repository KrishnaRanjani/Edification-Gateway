package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class d3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d3);

        TextView t1=(TextView)findViewById(R.id.ECE8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karu=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.upsc.gov.in/examinations/Engineering%20Services%20%28Preliminary%20-%20Stage%20I%29%20Examination%2C%202019\n"));
                startActivity(karu);
            }
        });
    }
}

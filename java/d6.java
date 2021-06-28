package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class d6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d6);

        TextView t1=(TextView)findViewById(R.id.nn8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karu=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.upsc.gov.in/examinations/National%20Defence%20Academy%20and%20Naval%20Academy%20Examination%20%28II%29%2C%202019\n"));
                startActivity(karu);
            }
        });
    }
}

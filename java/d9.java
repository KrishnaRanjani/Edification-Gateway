package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class d9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d9);

        TextView t1=(TextView)findViewById(R.id.IES8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karu=new Intent(Intent.ACTION_VIEW, Uri.parse("https://upsc.gov.in/examinations/Indian%20Economic%20Service%20and%20Indian%20Statistical%20Service%20Examination%2C%202019\n"));
                startActivity(karu);
            }
        });

    }
}

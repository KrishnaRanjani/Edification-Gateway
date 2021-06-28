package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class comquallist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comquallist);
        TextView t1 = findViewById(R.id.COM020);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apnaahangout.com/courses-to-do-after-12th-commerce/"));
                startActivity(in1);

            }
        });
    }
}

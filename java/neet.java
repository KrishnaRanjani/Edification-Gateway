package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class neet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet);


        TextView t1=(TextView)findViewById(R.id.neet8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karu=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sarvgyan.com/articles/neet-2020#targetText=NEET%20application%20process%20is%20going,MBBS%2C%20BDS%20%26%20Ayush%20Courses."));
                startActivity(karu);
            }
        });
    }
}

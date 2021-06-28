package com.example.sampleapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class tw5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tw5);


        TextView t1=(TextView)findViewById(R.id.ee8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karu=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aiimsexams.org/23 UCEED"));
                startActivity(karu);
            }
        });

    }
}

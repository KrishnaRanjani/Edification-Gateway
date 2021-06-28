package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lawclg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawclg);
        TextView tl1 = findViewById(R.id.law1);
        tl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nls.ac.in/"));
                startActivity(in1);

            }
        });
        TextView tl2 = findViewById(R.id.law2);
        tl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nludelhi.ac.in/"));
                startActivity(in2);

            }
        });
        TextView tl3 = findViewById(R.id.law3);
        tl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nalsar.ac.in/"));
                startActivity(in3);

            }
        });
        TextView tl4 = findViewById(R.id.law4);
        tl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iitkgp.ac.in/law"));
                startActivity(in4);

            }
        });
        TextView tl5= findViewById(R.id.law5);
        tl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nlujodhpur.ac.in/"));
                startActivity(in5);

            }
        });
        TextView tl6= findViewById(R.id.law6);
        tl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jgls.edu.in/"));
                startActivity(in6);

            }
        });
        TextView tl7= findViewById(R.id.law7);
        tl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gnlu.ac.in/GNLU/Home"));
                startActivity(in7);

            }
        });
        TextView tl8= findViewById(R.id.law8);
        tl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nliu.ac.in/"));
                startActivity(in8);

            }
        });
        TextView tl9= findViewById(R.id.law9);
        tl9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rgnul.ac.in/"));
                startActivity(in9);

            }
        });
        TextView t1l0= findViewById(R.id.law10);
        t1l0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in10 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://lawfaculty.du.ac.in/"));
                startActivity(in10);

            }
        });
        TextView tl11= findViewById(R.id.refer2);
        tl11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in11 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://law.careers360.com/colleges/ranking"));
                startActivity(in11);

            }
        });

    }
}

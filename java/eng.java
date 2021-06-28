package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class eng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng);
        TextView tm1 = findViewById(R.id.ex1);
        tm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitm.ac.in"));
                startActivity(in1);

            }
        });
        TextView tm2 = findViewById(R.id.ex2);
        tm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iitb.ac.in"));
                startActivity(in2);

            }
        });
        TextView tm3 = findViewById(R.id.ex3);
        tm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iitkgp.ac.in"));
                startActivity(in3);

            }
        });
        TextView tm4 = findViewById(R.id.ex4);
        tm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iitd.ac.in"));
                startActivity(in4);

            }
        });
        TextView tm5= findViewById(R.id.ex5);
        tm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iitk.ac.in"));
                startActivity(in5);
            }
        });
        TextView tm6= findViewById(R.id.ex6);
        tm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iitr.ac.in"));
                startActivity(in6);

            }
        });
        TextView tm7= findViewById(R.id.ex7);
        tm7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7 = new Intent(Intent.ACTION_VIEW, Uri.parse("Indian Institute of Technology Guwahati"));
                startActivity(in7);

            }
        });
        TextView tm8= findViewById(R.id.ex8);
        tm8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.annauniv.edu/"));
                startActivity(in8);

            }
        });
        TextView tm9= findViewById(R.id.ex9);
        tm9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in9 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jaduniv.edu.in"));
                startActivity(in9);

            }
        });
        TextView tm10= findViewById(R.id.ex10);
        tm10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in10 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iith.ac.in/"));
                startActivity(in10);

            }
        });
        TextView tm11= findViewById(R.id.refer);
        tm11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in11 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.srmuniversity.ac.in/blog/tag/list-of-best-engineering-colleges-in-india/"));
                startActivity(in11);

            }
        });


    }
}

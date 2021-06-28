package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class medi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medi);
        TextView t1 = findViewById(R.id.med1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aiims.edu/en.html"));
                startActivity(in1);

            }
        });
        TextView t2 = findViewById(R.id.med2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pgimer.edu.in/PGIMER_PORTAL/PGIMERPORTAL/home.jsp"));
                startActivity(in2);

            }
        });
        TextView t3 = findViewById(R.id.med3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cmch-vellore.edu/"));
                startActivity(in3);

            }
        });
        TextView t4 = findViewById(R.id.med4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://manipal.edu/kmc-manipal.html"));
                startActivity(in4);

            }
        });
        TextView t5= findViewById(R.id.med5);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kgmu.org/"));
                startActivity(in5);

            }
        });
        TextView t6= findViewById(R.id.med6);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jipmer.edu.in/"));
                startActivity(in6);

            }
        });
        TextView t7= findViewById(R.id.med7);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bhu.ac.in/"));
                startActivity(in7);

            }
        });
        TextView t8= findViewById(R.id.med8);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ilbs.in/"));
                startActivity(in8);

            }
        });
        TextView t9= findViewById(R.id.med9);
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amu.ac.in/principal.jsp?did=10146"));
                startActivity(in9);

            }
        });
        TextView t10= findViewById(R.id.med10);
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in10 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sriramachandra.edu.in/"));
                startActivity(in10);

            }
        });
        TextView t11= findViewById(R.id.refer1);
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in11 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.successcds.net/Top-Colleges/Medicine-MBBS-Top-25.htm"));
                startActivity(in11);

            }
        });
    }
}

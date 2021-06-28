package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class defense_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defense_list);
        TextView t1 = findViewById(R.id.def001);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://collegedunia.com/courses/bachelor-of-arts-ba-defence-and-strategic-studies"));
                startActivity(in1);
            }
        });
        TextView t2 = findViewById(R.id.def002);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://targetstudy.com/courses/ma-defence-and-strategic-studies.html"));
                startActivity(in2);
            }
        });
        TextView t3 = findViewById(R.id.def003);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://targetstudy.com/courses/ma-defence-studies.html"));
                startActivity(in3);
            }
        });
        TextView t4 = findViewById(R.id.def004);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indianarmy.nic.in/home"));
                startActivity(in4);
            }
        });
        TextView t5 = findViewById(R.id.def005);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.operationmilitarykids.org/intelligence-specialist-is/"));
                startActivity(in5);
            }
        });
        TextView t6 = findViewById(R.id.def006);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/National_Defence_Academy_(India)"));
                startActivity(in6);
            }
        });
        TextView t7 = findViewById(R.id.def007);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.goarmy.com/careers-and-jobs/browse-career-and-job-categories/construction-engineering/combat-engineer.html"));
                startActivity(in7);
            }
        });
        TextView t8 = findViewById(R.id.def008);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Army_Ordnance_Corps_(India)"));
                startActivity(in8);
            }
        });
        TextView t9 = findViewById(R.id.def009);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in9= new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Indian_Army_Pioneer_Corps"));
                startActivity(in9);
            }
        });
        TextView t10 = findViewById(R.id.def010);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in10= new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Defence_Security_Corps"));
                startActivity(in10);
            }
        });
        TextView t11 = findViewById(R.id.def011);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in11= new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Military_Farms_Service_(India)"));
                startActivity(in11);
            }
        });
        TextView t12 = findViewById(R.id.def012);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in12= new Intent(Intent.ACTION_VIEW, Uri.parse("http://joinindianarmy.nic.in/Authentication.aspx"));
                startActivity(in12);
            }
        });
    }
}

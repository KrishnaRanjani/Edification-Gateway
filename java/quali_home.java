package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quali_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quali_home);

        Button tenthu;
       tenthu=(Button)findViewById(R.id.ten);
        tenthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(),qualiten_home.class);
                startActivity(in1);
            }
        });

        Button twth;
        twth=(Button)findViewById(R.id.twelve);
        twth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(),qualtw_home.class);
                startActivity(in2);
            }
        });


        Button UG;
        UG=(Button)findViewById(R.id.UG);
        UG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(),pg.class);
                startActivity(in1);
            }
        });


    }
}

package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button area;
        area= findViewById(R.id.area);
         area.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent in=new Intent(getApplicationContext(),areahome.class);
                 startActivity(in);
             }
         });
        Button qualification;
        qualification= findViewById(R.id.qualification);
        qualification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(),quali_home.class);
                startActivity(in1);
            }
        });
        Button exam;
        exam = findViewById(R.id.exam);
        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(),xamhome.class);
                startActivity(in2);
            }
        });
        Button college;
        college = findViewById(R.id.clg);
        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(),clg_home.class);
                startActivity(in3);
            }
        });
        final Button contactb ;
        contactb = (Button)findViewById(R.id.contactb);
        contactb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(getApplicationContext(),contact.class);
                startActivity(in4);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.logout:
                kvk();
                break;
            case  R.id.feed:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScj5fJ7Vi9YtdN3oA-K4QGhaG55njVFvWEstkJouXIqO4A9pw/viewform"));
                startActivity(i);
                break;
        }
        return true;
    }
    public void kvk()
    {
        FirebaseAuth.getInstance().signOut();
        Intent kvk=new Intent(start.this,Login.class);
        startActivity(kvk);
    }
}

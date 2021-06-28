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
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.sql.BatchUpdateException;

public class home extends AppCompatActivity {

    TextView key;
    Button area;
    FirebaseAuth mFirebaseAuth;
    FirebaseAuth.AuthStateListener mAuthStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        key=(TextView)findViewById(R.id.key);
        area=(Button)findViewById(R.id.a);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent interest = new Intent(getApplicationContext(), start.class);
             startActivity(interest);
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
        Intent kvk=new Intent(home.this,Login.class);
        startActivity(kvk);
    }
}

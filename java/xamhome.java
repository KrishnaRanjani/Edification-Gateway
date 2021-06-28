package com.example.sampleapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class xamhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xamhome);


        final Button xam10;
        xam10 = (Button)findViewById(R.id.exam10);
        xam10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in13= new Intent(getApplicationContext(),exam10_home.class);
                startActivity(in13);
            }
        });

        final Button exam12;
        exam12 = (Button)findViewById(R.id.exam12);
        exam12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in14=new Intent(getApplicationContext(), exam12_home.class);
                startActivity(in14);
            }
        });

        final Button deg;
        deg = (Button)findViewById(R.id.examdeg);
        deg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in15=new Intent(getApplicationContext(),examdeg.class);
                startActivity(in15);
            }
        });

    }
}

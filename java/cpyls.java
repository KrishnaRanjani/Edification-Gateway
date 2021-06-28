package com.example.sampleapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class cpyls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpyls);

        TextView t1=(TextView)findViewById(R.id.cpyls8);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karu=new Intent(Intent.ACTION_VIEW, Uri.parse("https://timesofindia.indiatimes.com/home/education/news/CSIO-welcomes-CPYLS-for-young-and-brilliant-minds/articleshow/17476671.cms"));
                startActivity(karu);
            }
        });


    }
}

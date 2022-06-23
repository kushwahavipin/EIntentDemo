package com.e.eintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
 TextView gd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        gd=findViewById(R.id.gd);
        Bundle myv=this.getIntent().getExtras();
        gd.setText("Welcome "+myv.getString("name")+" ......");
    }
}
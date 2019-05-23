package com.example.lex.hackbiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Geometry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);
    }
    public void formulaClick(View v) {
        Intent myIntent = new Intent(Geometry.this, formulaGeometry.class);
        startActivity(myIntent);
    }

    public void khanClick(View v) {
        Intent myIntent = new Intent(Geometry.this, khan.class);
        startActivity(myIntent);
    }
}

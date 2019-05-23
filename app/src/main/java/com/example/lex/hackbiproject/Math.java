package com.example.lex.hackbiproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Math extends AppCompatActivity {

    Button algebra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        algebra = findViewById(R.id.Algebra);
    }

    public void AlgebraClick(View v) {
        Intent myIntent = new Intent(Math.this, Algebra.class);
        startActivity(myIntent);
    }

    public void CalculusClick(View v) {
        Intent myIntent = new Intent(Math.this, Calculus.class);
        startActivity(myIntent);
    }
    public void GeometryClick(View v) {
        Intent myIntent = new Intent(Math.this, Geometry.class);
        startActivity(myIntent);
    }
    public void TrigonometryClick(View v) {
        Intent myIntent = new Intent(Math.this, Trigonometry.class);
        startActivity(myIntent);
    }

}

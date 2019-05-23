package com.example.lex.hackbiproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
public class SecondActivity extends AppCompatActivity {
    Button math;
    Button science;
    Button english;
    Button history;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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
    }

    public void mathClick(View v) {
        Intent myIntent = new Intent(SecondActivity.this, Math.class);
        startActivity(myIntent);

    }

    public void englishClick(View v) {
        Intent myIntent = new Intent(SecondActivity.this, English.class);
        startActivity(myIntent);
    }

    public void scienceClick(View v) {
        Intent myIntent = new Intent(SecondActivity.this, Science.class);
        startActivity(myIntent);
    }

    public void historyClick(View v) {
        Intent myIntent = new Intent(SecondActivity.this, History.class);
        startActivity(myIntent);
    }

}

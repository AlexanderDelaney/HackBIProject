package com.example.lex.hackbiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import com.example.lex.hackbiproject.SecondActivity;
public class MainActivity extends AppCompatActivity {
    Button Subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Subject = findViewById(R.id.subjectButton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(myIntent);

    }

}

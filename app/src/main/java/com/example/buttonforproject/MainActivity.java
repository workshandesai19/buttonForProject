package com.example.buttonforproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPolice, btnMagenDavidAdom, btnFirefighters, btnMinistryOfEducation, btnDistrictSuperintendent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPolice = findViewById(R.id.button);
        btnMagenDavidAdom = findViewById(R.id.button2);
        btnFirefighters = findViewById(R.id.button3);
        btnMinistryOfEducation = findViewById(R.id.button4);
        btnDistrictSuperintendent = findViewById(R.id.button5);

        btnPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call("100");
            }
        });

        btnMagenDavidAdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call("101");
            }
        });

        btnFirefighters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call("102");
            }
        });

        btnMinistryOfEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call("*6552");
            }
        });

        btnDistrictSuperintendent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call("0500000001");
            }
        });
    }

    void call(String num) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + num));
        startActivity(intent);
    }
}
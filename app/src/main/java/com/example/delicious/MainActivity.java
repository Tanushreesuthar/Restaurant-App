package com.example.delicious;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView startercards;
    CardView mainscard;
    CardView Desertcard;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startercards=findViewById(R.id.card_view_starter);
        mainscard=findViewById(R.id.card_view_main_course);
Desertcard=findViewById(R.id.card_view_desert_course);

        startercards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent starteractivityIntent = new Intent(MainActivity.this , StarterActivity.class);
                startActivity(starteractivityIntent);
            }
        });

        mainscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maincourseactivityIntent = new Intent(MainActivity.this , MainCourseActivity.class);
                startActivity(maincourseactivityIntent);
            }
        });

        Desertcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent desertactivityIntent = new Intent(MainActivity.this , Desert.class);
                startActivity(desertactivityIntent);
            }
        });

        };
    }

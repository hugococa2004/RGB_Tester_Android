package com.hugodev.rgbtester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


import java.util.Timer;
import java.util.TimerTask;



public class TestHome extends AppCompatActivity {

    @Override
    public void NextFrame(View view) {
               view.setBackgroundResource(R.color.black);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_home);
        Button button = findViewById(R.id.button2);

        button.setOnClickListener(view -> {
            Intent otherActivity = new Intent(getApplicationContext(), TestHome.class);
            startActivity(otherActivity);
            finish();
        });

    };
}
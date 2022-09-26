package com.hugodev.rgbtester;

import static android.graphics.Color.parseColor;
import static android.graphics.Color.rgb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TestHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            int UI_OPTIONS = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
            getWindow().getDecorView().setSystemUiVisibility(UI_OPTIONS);
        }        setContentView(R.layout.activity_test_home);
        LinearLayout red = (LinearLayout) findViewById(R.id.layout1);
        LinearLayout green = (LinearLayout) findViewById(R.id.layout2);
        LinearLayout blue = (LinearLayout) findViewById(R.id.layout3);
        red.setOnClickListener(view -> {
            red.setVisibility(View.GONE);
        });
        green.setOnClickListener(view -> {
            green.setVisibility(View.GONE);
        });
        blue.setOnClickListener(view -> {
            blue.setVisibility(View.GONE);
        });
        setContentView(R.layout.activity_main);

        TextView btntxt = findViewById(R.id.textView7);
        btntxt.setOnClickListener(view -> {
            Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(otherActivity);
            finish();
        });

    }

}
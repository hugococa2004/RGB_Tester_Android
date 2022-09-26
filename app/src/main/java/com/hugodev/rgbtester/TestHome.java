package com.hugodev.rgbtester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TestHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int UI_OPTIONS = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
        getWindow().getDecorView().setSystemUiVisibility(UI_OPTIONS);
        setContentView(R.layout.activity_test_home);
        LinearLayout red = (LinearLayout) findViewById(R.id.layout1);
        LinearLayout green = (LinearLayout) findViewById(R.id.layout2);
        LinearLayout blue = (LinearLayout) findViewById(R.id.layout3);
        red.setOnClickListener(view -> red.setVisibility(View.GONE));
        green.setOnClickListener(view -> green.setVisibility(View.GONE));
        blue.setOnClickListener(view -> {
            Intent otherActivity = new Intent(getApplicationContext(), Final.class);
            startActivity(otherActivity);
            finish();
        });



    }

}
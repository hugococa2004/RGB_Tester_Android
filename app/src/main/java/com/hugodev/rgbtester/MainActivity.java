package com.hugodev.rgbtester;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent otherActivity = new Intent(getApplicationContext(), TestHome.class);
            startActivity(otherActivity);
            finish();
        });

        AdView mAdView = findViewById(R.id.adView_home);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, initializationStatus -> {
        });
        }
    }



package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;

import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;
import gr.net.maroulis.library.EasySplashScreen;
import android.graphics.Color;

import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(StartingScreenActivity.class)
                .withSplashTimeOut(3000)
                .withBackgroundColor(Color.parseColor("#1a1b29"))
                //.withHeaderText("Header")
              //  .withFooterText("Footer")
             //   .withBeforeLogoText("Before Logo Text")
                //.withAfterLogoText("After Logo Text")
                .withLogo(R.mipmap.ic_launcher_round);

        //config.getHeaderTextView().setTextColor(Color.WHITE);
      //  config.getFooterTextView().setTextColor(Color.WHITE);
     //   config.getBeforeLogoTextView().setTextColor(Color.WHITE);
     //   config.getAfterLogoTextView().setTextColor(Color.WHITE);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}
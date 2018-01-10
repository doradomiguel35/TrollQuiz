package com.uic.prelimexam.dorado;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MediaPlayer background  = MediaPlayer.create(SplashScreen.this,R.raw.trololol);
                background.setLooping(true);
                background.start();
                Intent splash = new Intent(SplashScreen.this,MainMenu.class);
                startActivity(splash);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}

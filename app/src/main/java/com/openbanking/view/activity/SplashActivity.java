package com.openbanking.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.openbanking.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                nextScreen();
            }
        }, 2000);

    }

    private void nextScreen() {

        timer.cancel();
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();

    }

}
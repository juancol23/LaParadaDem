package com.demo.laparada.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.demo.laparada.myapplication.view.activity.MainActivity;

public class SplashActivity extends AppCompatActivity {
    private ImageView mImage;
    private Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activity);

        mImage = findViewById(R.id.logo_image);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
        mImage.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                //finish();
            }
        }, 1000);

        mImage.startAnimation(animation);
    }
}

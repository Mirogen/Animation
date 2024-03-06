package com.example.shashank.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.sun);
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        imageView.startAnimation(sunRiseAnimation);

        ImageView imageView1 = findViewById(R.id.clock);
        Animation clockAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        imageView1.startAnimation(clockAnimation);

        ImageView imageView2 = findViewById(R.id.hour_hand);
        Animation hourAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        imageView2.startAnimation(hourAnimation);
    }
}
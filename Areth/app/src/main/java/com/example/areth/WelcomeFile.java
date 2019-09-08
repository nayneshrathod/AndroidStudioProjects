package com.example.areth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeFile extends AppCompatActivity {
    private static int timeout = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_file);
        ImageView btn = (ImageView) findViewById(R.id.imgvw);
        TextView bal = (TextView) findViewById(R.id.txtve);
        Animation frombm = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        Animation fromtp = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        btn.setAnimation(frombm);
        bal.setAnimation(fromtp);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(WelcomeFile.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, timeout);
    }
}
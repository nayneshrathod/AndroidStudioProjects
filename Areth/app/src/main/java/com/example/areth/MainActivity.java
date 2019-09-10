package com.example.areth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    private static int timeout = 1500;

    ImageView bal, wel;
    Animation frombm, fromtp,zoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnsub);
        bal = (ImageView) findViewById(R.id.ballon);
        wel = (ImageView) findViewById(R.id.welcome);

        frombm = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        fromtp = AnimationUtils.loadAnimation(this, R.anim.fromtop);

        btn.setAnimation(frombm);
        bal.setAnimation(fromtp);
        wel.setAnimation(frombm);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin);
                wel.setVisibility(View.VISIBLE);
                wel.startAnimation(zoom);
                Handler handler = new Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(MainActivity.this, Login.class);
                        startActivity(i);
                        finish();
                    }
                }, timeout);
            }
        });
    }
}
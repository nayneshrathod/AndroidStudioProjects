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
    private static int timeout = 1000;
    ImageView bal;
    Animation frombm, fromtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.btnsub);
        bal = (ImageView) findViewById(R.id.ballon);
        frombm = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        fromtp = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        btn.setAnimation(frombm);
        bal.setAnimation(fromtp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_LONG).show();
                fromtp = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fromtop);
                bal.setAnimation(fromtp);
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

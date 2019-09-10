package com.example.nightlighteeffct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int timeout = 1000;
    ImageView welcomeName, sideLamp, bottomCloud, topCloud, startarrow;
    Animation frombottom, fromtop, fromleft, zoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeName = (ImageView) findViewById(R.id.welcomename);
        sideLamp = (ImageView) findViewById(R.id.sidelamp);
        topCloud = (ImageView) findViewById(R.id.topcloud);
        bottomCloud = (ImageView) findViewById(R.id.bottomcloud);
        startarrow = (ImageView) findViewById(R.id.startArrow);

        frombottom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(MainActivity.this, R.anim.tobottom);
        fromleft = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fromleft);
        zoom = AnimationUtils.loadAnimation(this, R.anim.zoomin);

        startarrow.setAnimation(fromleft);
        bottomCloud.setAnimation(frombottom);
        welcomeName.setAnimation(zoom);
        topCloud.setAnimation(fromtop);

        startarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frombottom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.frombottom);
                fromtop = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.tobottom);
                zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin);
                bottomCloud.setVisibility(View.VISIBLE);
                topCloud.setVisibility(View.VISIBLE);
                welcomeName.setVisibility(View.VISIBLE);
                bottomCloud.startAnimation(frombottom);
                welcomeName.startAnimation(zoom);
                topCloud.startAnimation(fromtop);

                Toast.makeText(getApplicationContext(), "Animation Run successfully", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
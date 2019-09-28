package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_send, btn_clear;
    TextView user, user_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_send = findViewById(R.id.send_data);
        btn_clear = findViewById(R.id.clear_data);

        Intent intent = getIntent();
        String us = intent.getStringExtra("username");
        String ua = intent.getStringExtra("address");
        user = findViewById(R.id.user_person);
        user_add = findViewById(R.id.user_person_add);
        user.setText(us);
        user_add.setText(ua);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Application Is Working", Toast.LENGTH_LONG).show();
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Data Clear Succsefully", Toast.LENGTH_LONG).show();
            }
        });
    }
}
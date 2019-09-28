package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_Main extends AppCompatActivity {
    Button btn_login;
    EditText user, useradd;
    String u, a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__main);
        user = findViewById(R.id.personName);
        useradd = findViewById(R.id.personAddress);

        btn_login = findViewById(R.id.Go_to_main_page);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                u = user.getText().toString();
                a = useradd.getText().toString();
                Intent intent = new Intent(Login_Main.this, MainActivity.class);
                intent.putExtra("username", u);
                intent.putExtra("address", a);
                startActivity(intent);

                //startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}
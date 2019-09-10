package com.example.areth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText user, pass;
    String u, p;
    Button logn, clrs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.userName);
        pass = (EditText) findViewById(R.id.passWord);
        clrs = (Button) findViewById(R.id.btnRest);
        logn = (Button) findViewById(R.id.btnLogin);

        user.setText("admin");
        pass.setText("123");

        clrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setText("");
                pass.setText("");
            }
        });

        logn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                u = user.getText().toString();
                p = pass.getText().toString();
                if (u.equals("admin") && p.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Welcome To Operation", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), Register.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Coordinates", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

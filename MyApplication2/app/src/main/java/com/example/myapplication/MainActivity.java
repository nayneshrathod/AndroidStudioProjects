package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText eda,edb;
    Button btn, btn1;
    int a ,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eda = (EditText) findViewById(R.id.fno);
        edb = (EditText) findViewById(R.id.sno);
        btn = (Button) findViewById(R.id.BtnAdd);
        btn1 = (Button) findViewById(R.id.show);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast msg = Toast.makeText(getBaseContext(),"Shaw The Data",Toast.LENGTH_LONG);
                msg.show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(eda.getText().toString());
                b = Integer.parseInt(edb.getText().toString());
                c = a+b;
                Toast msg = Toast.makeText(getBaseContext(),c,Toast.LENGTH_LONG);
                msg.show();
            }
        });
    }
}

package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnA,btnS,btnD,btnM;
    EditText n1 ,n2;TextView result;
    double a,b,sum =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.txtView);
        n1 = (EditText)findViewById(R.id.editText);
        n2 = (EditText)findViewById(R.id.editText1);
        btnA = (Button)findViewById(R.id.btnAdd);
        btnS = (Button)findViewById(R.id.btnSub);
        btnD = (Button)findViewById(R.id.btnDiv);
        btnM = (Button)findViewById(R.id.btnMul);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 a =  Integer.parseInt(n1.getText().toString());
                 b =  Integer.parseInt(n2.getText().toString());
                 sum = a+b;
                result.setText(Double.toString(sum));
                //  Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_SHORT).show();
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 a =  Integer.parseInt(n1.getText().toString());
                 b =  Integer.parseInt(n2.getText().toString());
                sum = a-b;

                result.setText(Double.toString(sum));
                //  Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_SHORT).show();
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 a =  Integer.parseInt(n1.getText().toString());
                 b =  Integer.parseInt(n2.getText().toString());
                sum = a*b;

                result.setText(Double.toString(sum));
                //  Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_SHORT).show();
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 a =  Integer.parseInt(n1.getText().toString());
                 b =  Integer.parseInt(n2.getText().toString());
                sum = a/b;

                result.setText(Double.toString(sum));
                //  Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity {
    Button btn;
    TextView txtsum;
    EditText n1 ,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        n1 = (EditText)findViewById(R.id.editText);
        n2 = (EditText)findViewById(R.id.editText1);
        txtsum =(TextView)findViewById(R.id.txtView);
        btn = (Button)findViewById(R.id.gtBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String N1 = n1.getText().toString();
                String N2 = n2.getText().toString();
                int a =  Integer.parseInt(N1);
                int b =  Integer.parseInt(N2);
                int sum = a+b;
                txtsum.setText(sum);
            }
        });
    }
}

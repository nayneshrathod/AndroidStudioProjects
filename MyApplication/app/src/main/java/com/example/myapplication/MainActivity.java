package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // RadioButton android1, angular,java1,python;
    Button btn;
    TextView txtsum;
    EditText n1 ,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* android1 = (RadioButton)findViewById(R.id.rdbAndr);
        angular = (RadioButton)findViewById(R.id.rdbAngular);
        python = (RadioButton)findViewById(R.id.rdbPy);
        java1 = (RadioButton)findViewById(R.id.rdbJava);
        Button btn1 = (Button)findViewById(R.id.getBtn);
*/
        n1 = (EditText)findViewById(R.id.editText);
        n2 = (EditText)findViewById(R.id.editText1);
        txtsum =(TextView)findViewById(R.id.txtView);
        btn = (Button)findViewById(R.id.gtBtn);
/*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Result = "Slected Course : ";
                Result += (android1.isChecked())?"Android":(angular.isChecked())?"Angular":(java1.isChecked())?"Java":(python.isChecked())?"Python":"";
                Toast.makeText(getApplicationContext(),Result,Toast.LENGTH_SHORT).show();
            }
        });*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String N1 = n1.getText().toString();
                String N2 = n2.getText().toString();
                int a =  Integer.parseInt(N1);
                int b =  Integer.parseInt(N2);
                int sum = a+b;
                txtsum.setText(sum);
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_SHORT).show();
            }
        });
    }
   /* public  void  onRadioButtonClick(View view){
        boolean checked =((RadioButton) view).isChecked();
        String str="";
        switch (view.getId()){
            case  R.id.rdbAndr:
                if(checked)  str ="Android Selected";break;
            case  R.id.rdbAngular:
                if(checked)  str ="Angular Selected";break;
            case  R.id.rdbJava:
                if(checked)  str ="Java Selected";break;
            case  R.id.rdbPy:
                if(checked)  str ="Python Selected";break;
        }
            Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
    }*/
}
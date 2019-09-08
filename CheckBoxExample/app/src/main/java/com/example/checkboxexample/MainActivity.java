package com.example.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Constraints;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cr, cg, cb;
    Button sd;
    String str;
    TextView txt;
    LinearLayout lr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cr = (CheckBox) findViewById(R.id.chkRed);
        cg = (CheckBox) findViewById(R.id.chkgreen);
        cb = (CheckBox) findViewById(R.id.chkBlue);
        sd = (Button) findViewById(R.id.btnShow);
        txt = (TextView) findViewById(R.id.txtvw);
        lr = (LinearLayout) findViewById(R.id.bg);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Addition.class);
                startActivity(i);
            }
        });
        cr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                lr.setBackgroundColor(Color.RED);
            }
        });
        cg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                lr.setBackgroundColor(Color.GREEN);
            }
        });
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                lr.setBackgroundColor(Color.BLUE);
            }
        });
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = "";
                if (cr.isChecked()) {
                    str += cr.getText().toString();
                }
                if (cg.isChecked()) {
                    str += cg.getText().toString() + "\n";
                }
                if (cb.isChecked()) {
                    str += cb.getText().toString() + "\n";
                }
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
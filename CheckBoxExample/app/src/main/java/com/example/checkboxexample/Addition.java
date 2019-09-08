package com.example.checkboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {
    EditText fn, sn;
    Button add, sdd, ddd, mdd, bdd;
    TextView rlt;
    int r, n1, n2;
    String s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        fn = (EditText) findViewById(R.id.numst);
        sn = (EditText) findViewById(R.id.numsd);
        add = (Button) findViewById(R.id.btnAdd);
        sdd = (Button) findViewById(R.id.btnSub);
        ddd = (Button) findViewById(R.id.btnDiv);
        mdd = (Button) findViewById(R.id.btnMul);
        bdd = (Button) findViewById(R.id.btnback);
        rlt = (TextView) findViewById(R.id.txtResult);
        n1 = Integer.parseInt(fn.getText().toString());
        n2 = Integer.parseInt(sn.getText().toString());
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r = n1 + n2;

                rlt.setText(r);
            }
        });

        sdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r = n1 - n2;
                rlt.setText(r);
            }
        });

        ddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r = n1 / n2;
                rlt.setText(r);
            }
        });

        mdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r = n1 * n2;
                rlt.setText(r);
            }
        });

        bdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}

package com.example.areth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GerateApp extends AppCompatActivity {
    EditText fn, sn;
    Button add , sdd, ddd, mdd, bdd;
    TextView rlt;
    int r = 0, nn, nnn;
    String ss, sss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerate_app);
        fn = (EditText) findViewById(R.id.numst);
        sn = (EditText) findViewById(R.id.numsd);
        add = (Button) findViewById(R.id.btnAdd);
        sdd = (Button) findViewById(R.id.btnSub);
        ddd = (Button) findViewById(R.id.btnDiv);
        mdd = (Button) findViewById(R.id.btnMul);
        bdd = (Button) findViewById(R.id.btnback);
        rlt = (TextView) findViewById(R.id.txtResult);
/*
        nn = Integer.parseInt(fn.getText().toString());
        nnn = Integer.parseInt(sn.getText().toString());
*/
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nn = Integer.parseInt(fn.getText().toString());
                nnn = Integer.parseInt(sn.getText().toString());
                r = nn + nnn;
                Toast.makeText(getApplicationContext(),r,Toast.LENGTH_SHORT).show();
                //rlt.setText(r);
            }
        });

        sdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nn = Integer.parseInt(fn.getText().toString());
                nnn = Integer.parseInt(sn.getText().toString());

                r = nn - nnn;
                Toast.makeText(getApplicationContext(),r,Toast.LENGTH_SHORT).show();
//                rlt.setText(r);
            }
        });

        ddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nn = Integer.parseInt(fn.getText().toString());
                nnn = Integer.parseInt(sn.getText().toString());

                r = nn / nnn;
                Toast.makeText(getApplicationContext(),r,Toast.LENGTH_SHORT).show();
//                rlt.setText(r);
            }
        });

        mdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nn = Integer.parseInt(fn.getText().toString());
                nnn = Integer.parseInt(sn.getText().toString());

                r = nn * nnn;
                Toast.makeText(getApplicationContext(),r,Toast.LENGTH_SHORT).show();
//                rlt.setText(r);
            }
        });

        bdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), WelcomeFile.class);
                startActivity(i);
            }
        });
    }
}

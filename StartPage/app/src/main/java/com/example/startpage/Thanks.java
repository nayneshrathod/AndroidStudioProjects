package com.example.startpage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Thanks extends AppCompatActivity {
    ImageView imga;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);
        imga = (ImageView) findViewById(R.id.imageView1);
        btn2 = (Button) findViewById(R.id.btn2);
        imga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intestpasM = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intestpasM);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertD = new AlertDialog.Builder(Thanks.this);
                alertD.setTitle("Confirm Exit..!");
                alertD.setIcon(R.drawable.arow);
                alertD.setMessage("THis is a Sample alert Dialog Box");
                alertD.setCancelable(false);
                alertD.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

                alertD.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"You Click No",Toast.LENGTH_LONG).show();
                    }
                });

                alertD.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"You Click Cancel",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alerd = alertD.create();
                alerd.show();
            }
        });
    }
}

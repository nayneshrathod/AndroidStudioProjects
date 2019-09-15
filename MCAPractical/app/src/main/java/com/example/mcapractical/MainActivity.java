package com.example.mcapractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView spipac,gretnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spipac =(TextView) findViewById(R.id.spinner_practical);
        gretnum =(TextView) findViewById(R.id.greter_number);
        spipac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Spiine.class));
            }
        });
        gretnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),GreterNumber.class));
            }
        });
    }
}

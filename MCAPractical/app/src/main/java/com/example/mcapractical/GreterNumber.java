package com.example.mcapractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.logging.StreamHandler;

public class GreterNumber extends AppCompatActivity {
    TextView res, back;
    Button sho;
    EditText fn, sn;
    int n1, n2, n3;
    String str = "Grater number Is : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greter_number);
        res = findViewById(R.id.result);
        fn = findViewById(R.id.fstno);
        sn = findViewById(R.id.sndno);
        sho = findViewById(R.id.btnresult);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }
        });
        sho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(fn.getText().toString());
                n2 = Integer.parseInt(sn.getText().toString());
                if (n1 > n2)
                    n3 = n1;
                else
                    n3 = n2;

                if (n1 != n2)
                    res.setText(str + n3);
                else
                    res.setText("Both No Are Same");
            }
        });

    }
}
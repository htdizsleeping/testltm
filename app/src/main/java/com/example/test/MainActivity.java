package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB, edtS;
    Button btnT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // anh xa toi control
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtS = findViewById(R.id.edtS);
        btnT = findViewById(R.id.btnT);
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt((edtA.getText().toString()));
                int b = Integer.parseInt((edtB.getText().toString()));
                int kq = a + b;
                edtS.setText(kq + "");
            }
        });
    }
}
package com.myapplicationdev.android.demoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName = findViewById(R.id.editText);
                EditText etAge = findViewById(R.id.editText2);
                String[] info = {etName.getText().toString(), etAge.getText().toString()};
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });
    }
}

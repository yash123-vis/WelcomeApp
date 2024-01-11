package com.example.pcworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText newedit = findViewById(R.id.editText);
        Button newbutton =findViewById(R.id.button);
        TextView mytext = findViewById(R.id.textView);

        newbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = newedit.getText().toString();
                Toast.makeText(MainActivity.this,"Welcome "+input,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
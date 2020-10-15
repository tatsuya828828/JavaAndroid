package com.kuma.javaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hello = findViewById(R.id.textview_hello);
        String text = hello.getText().toString();
        Log.d("MainActivity", text);
        String text2 = "Hello, Android";
        hello.setText(text2);
    }
}
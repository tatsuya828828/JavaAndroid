package com.kuma.javaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
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
        // Color.parseColorに文字列やカラーコードを渡すことで数値に変換し
        // setTextColorに渡すことができるようになる
        hello.setTextColor(Color.parseColor("blue"));
        hello.setTypeface(Typeface.DEFAULT_BOLD);
    }
}
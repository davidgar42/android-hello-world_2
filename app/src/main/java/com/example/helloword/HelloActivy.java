package com.example.helloword;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HelloActivy extends AppCompatActivity {
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        String msg = getIntent().getStringExtra("msgHello");

        TextView tvHello = findViewById(R.id.tvHello);
        tvHello.setText(msg);
    }
}

package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //TextView tvHello = findViewById(R.id.tvHello);
        EditText etHello = findViewById(R.id.etHello);
        Button btHello = findViewById(R.id.btHello);

        btHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hello = etHello.getText().toString();
                if(hello.isEmpty())
                    return;
                Intent intent = new Intent(MainActivity.this,HelloActivy.class);
                intent.putExtra("msgHello",hello);
                startActivity(intent);
            }
        });


    }
}
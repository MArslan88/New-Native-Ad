package com.mhdarslan.newnativead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button native_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        native_btn = findViewById(R.id.native_btn);
        native_btn.setOnClickListener(v -> {
            startActivity(new Intent(this, NativeActivity.class));
        });
    }
}
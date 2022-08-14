package com.example.custombuttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        window = getWindow();
        window.setBackgroundDrawableResource(R.drawable.gradient_toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Garry");
    }
}
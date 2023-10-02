package com.example.laba1;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void butClick (View view){
        TextView txtHello = findViewById(R.id.textView);
        txtHello.setText("Postavte 10");
    }
}
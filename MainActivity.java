package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float font = 24;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t1 = findViewById(R.id.textView1);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(v -> {
            t1.setTextSize(font);
            font += 4;
            if (font == 40) font = 20;
        });

        button2.setOnClickListener(v -> {
            switch (i) {
                case 1:
                    t1.setTextColor(Color.parseColor("#0000FF"));
                    break;
                case 2:
                    t1.setTextColor(Color.parseColor("#00FF00"));
                    break;
                case 3:
                    t1.setTextColor(Color.parseColor("#FF0000"));
                    break;
                case 4:
                    t1.setTextColor(Color.parseColor("#100000"));
                    break;
            }
            i++;
            if (i == 5) i = 1;
        });
    }
}

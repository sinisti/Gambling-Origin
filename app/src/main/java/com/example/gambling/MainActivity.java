package com.example.gambling;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView Kostka1;
    private TextView Kostka2;
    private TextView Kostka3;
    private TextView Kostka4;
    private TextView Kostka5;
    private int random1 = 0;
    private int random2 = 0;
    private int random3 = 0;
    private int random4 = 0;
    private int random5 = 0;
    private Button roll_dices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize roll_dices button
        roll_dices = findViewById(R.id.roll_dices);

        roll_dices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    void rollDice() {
        Kostka1 = findViewById(R.id.Kostka1);
        random1 = (int) (Math.random() * 6 + 1);
        Kostka1.setText(Integer.toString(random1));
        Kostka2 = findViewById(R.id.Kostka2);
        random2 = (int) (Math.random() * 6 + 1);
        Kostka2.setText(Integer.toString(random2));
        Kostka3 = findViewById(R.id.Kostka3);
        random3 = (int) (Math.random() * 6 + 1);
        Kostka3.setText(Integer.toString(random3));
        Kostka4 = findViewById(R.id.Kostka4);
        random4 = (int) (Math.random() * 6 + 1);
        Kostka4.setText(Integer.toString(random4));
        Kostka5 = findViewById(R.id.Kostka5);
        random5 = (int) (Math.random() * 6 + 1);
        Kostka5.setText(Integer.toString(random5));
    }
}
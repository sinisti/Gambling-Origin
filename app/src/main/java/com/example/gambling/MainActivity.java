package com.example.gambling;
import android.os.Bundle;
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
    private int rkosc1;
    private int rkosc2;
    private int rkosc3;
    private int rkosc4;
    private int rkosc5;
    private Button roll_dices;
    private Button reset;
    private TextView liczba_rzutow;
    private TextView wynik_losowania;
    private int[] wyniki;
    private int count  = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liczba_rzutow = (TextView)findViewById(R.id.liczba_rzutow);
        wynik_losowania = (TextView)findViewById(R.id.wynik_losowania);
        roll_dices = findViewById(R.id.roll_dices);
        Kostka1 = findViewById(R.id.Kostka1);
        Kostka2 = findViewById(R.id.Kostka2);
        Kostka3 = findViewById(R.id.Kostka3);
        Kostka4 = findViewById(R.id.Kostka4);
        Kostka5 = findViewById(R.id.Kostka5);
        reset = findViewById(R.id.reset);
        roll_dices = findViewById(R.id.roll_dices);
        roll_dices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
                //TEST();
            };
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResetCount();
            }
        });
    }
    private void rollDice() {
        count++;
        liczba_rzutow.setText("Liczba rzutów: " + count);
        rkosc1 = (int) (Math.random() * 6 + 1);
        Kostka1.setText(Integer.toString(rkosc1));
        rkosc2 = (int) (Math.random() * 6 + 1);
        Kostka2.setText(Integer.toString(rkosc2));
        rkosc3 = (int) (Math.random() * 6 + 1);
        Kostka3.setText(Integer.toString(rkosc3));
        rkosc4 = (int) (Math.random() * 6 + 1);
        Kostka4.setText(Integer.toString(rkosc4));
        rkosc5 = (int) (Math.random() * 6 + 1);
        Kostka5.setText(Integer.toString(rkosc5));
        //wyniki[0]=rkosc1;
        //wyniki[1]=rkosc2;
        //wyniki[2]=rkosc3;
        //wyniki[3]=rkosc4;
        //wyniki[4]=rkosc5;
    }
    void ResetCount(){liczba_rzutow.setText("Liczba rzutów: 0");}
    //void TEST(){
    //    if(wyniki[0]==wyniki[1]){
    //        System.out.println("AAA");
    //    }
    //}
}

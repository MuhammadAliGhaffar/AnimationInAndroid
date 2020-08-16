package com.example.animationinandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txthelloworld,txt2,txt3,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txthelloworld=findViewById(R.id.txthelloworld);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        txt4=findViewById(R.id.txt4);
        txthelloworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.i("TAG","TextView is Tapped");
                txthelloworld.animate().rotation(360f).setDuration(1000);
            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.animate().scaleX(30f).setDuration(1000);
            }
        });


        txt4.animate().alpha(0f).setDuration(0);
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt3.animate().alpha(0f).setDuration(3000);
                txt4.animate().alpha(1f).setDuration(3000);
            }
        });

    }
}
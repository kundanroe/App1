package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton = (Button) findViewById(R.id.indoPak);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, IndoPakActivity.class));
            }
        });

                Button nButton = (Button) findViewById(R.id.kargilWar);
        mButton.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           startActivity(new Intent(MainActivity.this, kargilActivity.class));
                                       }
                                   }
        );


        Button pButton = (Button) findViewById(R.id.indoChina);
        mButton.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           startActivity(new Intent(MainActivity.this, IndochinaActivity.class));
                                       }
                                   }
        );
    }
}
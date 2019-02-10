package com.example.shash.socio_sport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class csgo extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csgo);

        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        bt4 = findViewById(R.id.button4);
        bt5 = findViewById(R.id.button5);
        bt6 = findViewById(R.id.button6);
        bt7 = findViewById(R.id.button7);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent session1 = new Intent(csgo.this, UserDetailsCSGOSession1.class);
                startActivity(session1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent session2 = new Intent(csgo.this, UserDetailsCSGOSession2.class);
                startActivity(session2);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent session3 = new Intent(csgo.this, UserDetailsCSGOSession3.class);
                startActivity(session3);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent session4 = new Intent(csgo.this, UserDetailsCSGOSession4.class);
                startActivity(session4);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent session5 = new Intent(csgo.this, UserDetailsCSGOSession5.class);
                startActivity(session5);
            }
        });
    }
}

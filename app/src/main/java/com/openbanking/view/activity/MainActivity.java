package com.openbanking.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.openbanking.R;
import com.openbanking.view.activity.bradesco.BradescoActivity;

public class MainActivity extends AppCompatActivity {

    private Button bt_bradesco;
    private Button bt_itau;
    private Button bt_santander;
    private Button bt_caixa;
    private Button bt_bb;
    private Button bt_citi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    initViews();

    bt_bradesco.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, BradescoActivity.class));
        }
    });

    bt_itau.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, ItauActivity.class));
        }
    });

    bt_santander.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, SantanderActivity.class));
        }
    });

    bt_caixa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, CaixaActivity.class));
        }
    });

    bt_bb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, BbActivity.class));
        }
    });

    bt_citi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, CitiActivity.class));
        }
    });

    }

    private void initViews() {

        bt_bradesco = findViewById(R.id.button_bradesco);
        bt_itau = findViewById(R.id.button_itau);
        bt_santander = findViewById(R.id.button_santander);
        bt_caixa = findViewById(R.id.button_caixa);
        bt_bb = findViewById(R.id.button_bb);
        bt_citi = findViewById(R.id.button_citi);


    }
}
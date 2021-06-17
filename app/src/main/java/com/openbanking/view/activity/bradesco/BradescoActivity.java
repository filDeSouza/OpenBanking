package com.openbanking.view.activity.bradesco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.openbanking.R;

public class BradescoActivity extends AppCompatActivity {

    private Button botaoDependencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bradesco);

        initViews();

        botaoDependencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BradescoActivity.this, DependenciasActivity.class));
            }
        });

    }

    private void initViews() {

        botaoDependencias = findViewById(R.id.buttonDependencias);

    }
}
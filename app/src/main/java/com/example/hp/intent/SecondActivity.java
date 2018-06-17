package com.example.hp.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public abstract class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button myNewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myActivity = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(myActivity);
            }
        });

    }
}

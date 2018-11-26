package com.example.a9470m.listatodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView txtProduct = (TextView) findViewById(R.id.label);

        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("details");
        // displaying selected product name
        txtProduct.setText(product);


    }
}

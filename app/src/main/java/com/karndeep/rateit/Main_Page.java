package com.karndeep.rateit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Main_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__page);

        Intent intent = getIntent();

        String txtName = intent.getStringExtra("Name");
        String txtAge = intent.getStringExtra("age");

        TextView tName = (TextView) findViewById(R.id.txtViewName);
        TextView tAge = (TextView) findViewById(R.id.txtViewAge);

        tName.setText(txtName);
        tAge.setText(txtAge);

        Button btnRate = (Button) findViewById(R.id.btnRate);
        btnRate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Page.this, Rating_Page.class);
                startActivity(intent);
            }
        });

    }
}

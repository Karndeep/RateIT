package com.karndeep.rateit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSignUp = (Button) findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {

                EditText txtName = (EditText) findViewById(R.id.txtName);
                EditText txtAge = (EditText) findViewById(R.id.txtAge);
                EditText txtPass = (EditText) findViewById(R.id.txtPAss);

                if(txtName.getText().toString().trim().equals("")){
                    txtName.setError( "Name is required!" );

                }
                else if(txtAge.getText().toString().trim().equals("")){
                    txtAge.setError( "Age is required!" );
                }
                else if(txtPass.getText().toString().trim().equals("")){
                    txtPass.setError( "Password is required!" );
                }
                else{
                    String name = txtName.getText().toString();
                    String age = txtAge.getText().toString();
                    Intent intent = new Intent(MainActivity.this, Main_Page.class);
                    intent.putExtra("Name", name);
                    intent.putExtra("age", age);
                    startActivity(intent);
                }
            }
        });
    }
}

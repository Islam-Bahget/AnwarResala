package com.example.islam.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class First extends AppCompatActivity implements View.OnClickListener {

    String phone = "123";
    String password = "123";
    EditText phoneEditTet, passwordEdit;
    Button logIn;
    TextView signUp;


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        phoneEditTet = findViewById(R.id.phone);
        passwordEdit = findViewById(R.id.pass);

        logIn = findViewById(R.id.log);
        signUp = findViewById(R.id.sign_up);

        logIn.setOnClickListener(this);
        signUp.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (view == logIn) {

            String phoneString = phoneEditTet.getText().toString().trim();
            String passString = passwordEdit.getText().toString().trim();

            if (phoneString.equals(phone)
                    && passString.equals(password)) {
                Intent intent = new Intent(First.this, HomePage.class);
                startActivity(intent);


            }else {
                Toast.makeText(this,"Try Again",Toast.LENGTH_SHORT).show();
            }
        } else if (view == signUp) {
            Intent intent = new Intent(First.this, SignUp.class);
            startActivity(intent);

        }

    }
}

package com.example.githubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onResister (View view) {
        TextView firstName = findViewById(R.id.textView);
        TextView lastName = findViewById(R.id.textView2);
        TextView email = findViewById(R.id.textView3);

        EditText editTxtFirstName = findViewById(R.id.enterFirstName);
        EditText editTxtLastName = findViewById(R.id.enterLastName);
        EditText editTxtEmail = findViewById(R.id.enterEmail);

        firstName.setText("First Name: " + editTxtFirstName.getText().toString());
        lastName.setText("Last Name: " + editTxtLastName.getText().toString());
        email.setText("Email: " + editTxtEmail.getText().toString());
    }
}
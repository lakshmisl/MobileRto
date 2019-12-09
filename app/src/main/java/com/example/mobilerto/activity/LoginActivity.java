package com.example.mobilerto.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobilerto.R;

public class LoginActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = findViewById(R.id.activity_login_username);
        final EditText etPassword = findViewById(R.id.activity_login_password);
        Button btnLogin = findViewById(R.id.activity_login_button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.equals("username") && password.equals("password")) {
                    Intent intent = new Intent(getApplicationContext(), RedirectingHome.class);
                    startActivity(intent);
                } else {
                    Toast
                            .makeText(getApplicationContext(), "Invalid Credential: ", Toast.LENGTH_LONG)
                            .show();
                }

            }
        });
    }

    public void processSignUpLinkClick(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
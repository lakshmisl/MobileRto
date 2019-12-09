package com.example.mobilerto.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MockQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.mobilerto.R.layout.activity_mockquiz);
    }

    public void processHomeClick(View view) {
        Intent intent = new Intent(this, RedirectingHome.class);
        startActivity(intent);
    }
}
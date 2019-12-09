package com.example.mobilerto.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobilerto.R;

public class ApplyRegistrationActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applyregistration);
    }

    public void processfileUpLinkClick(View view) {
        Intent intent = new Intent(this, FileUploadActivity.class);
        startActivity(intent);
    }
}
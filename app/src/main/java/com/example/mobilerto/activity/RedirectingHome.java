package com.example.mobilerto.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobilerto.R;

public class RedirectingHome extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirectinghome);
    }

    public void processApplyLicenseClick(View view) {
        Intent intent = new Intent(this, ApplyLicenseActivity.class);
        startActivity(intent);
    }
    public void processApplyRegistrationClick(View view) {
        Intent intent = new Intent(this, ApplyRegistrationActivity.class);
        startActivity(intent);
    }
    public void processLicenseSearchClick(View view) {
        Intent intent = new Intent(this, LicenseSearchActivity.class);
        startActivity(intent);
    }
    public void processVehicleSearchClick(View view) {
        Intent intent = new Intent(this, VehicleSearchActivity.class);
        startActivity(intent);
    }
    public void processMockTestClick(View view) {
        Intent intent = new Intent(this, ApplyLicenseActivity.class);
        startActivity(intent);
    }
    public void processApplyLicenseClick(View view) {
        Intent intent = new Intent(this, ApplyLicenseActivity.class);
        startActivity(intent);
    }
}
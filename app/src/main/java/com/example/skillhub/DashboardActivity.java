package com.example.skillhub;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button btnAssessment, btnRoadmap, btnTrending, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnAssessment = findViewById(R.id.btnAssessment);
        btnRoadmap = findViewById(R.id.btnRoadmap);
        btnTrending = findViewById(R.id.btnTrending);
        btnProfile = findViewById(R.id.btnProfile);

        btnAssessment.setOnClickListener(v ->
                startActivity(new Intent(
                        DashboardActivity.this,
                        AssessmentActivity.class)));

        btnRoadmap.setOnClickListener(v ->
                startActivity(new Intent(
                        DashboardActivity.this,
                        RoadmapActivity.class)));

        btnTrending.setOnClickListener(v ->
                startActivity(new Intent(
                        DashboardActivity.this,
                        TrendingActivity.class)));

        btnProfile.setOnClickListener(v ->
                startActivity(new Intent(
                        DashboardActivity.this,
                        ProfileActivity.class)));
    }
}
package com.example.skillhub;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RoadmapActivity extends AppCompatActivity {

    Button btnAndroid, btnWeb, btnData;
    TextView tvRoadmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roadmap);

        btnAndroid = findViewById(R.id.btnAndroid);
        btnWeb = findViewById(R.id.btnWeb);
        btnData = findViewById(R.id.btnData);
        tvRoadmap = findViewById(R.id.tvRoadmap);

        btnAndroid.setOnClickListener(v ->
                tvRoadmap.setText(
                        "Java → XML → Android Studio → Firebase → APIs → Projects"));

        btnWeb.setOnClickListener(v ->
                tvRoadmap.setText(
                        "HTML → CSS → JavaScript → React → Node.js → Projects"));

        btnData.setOnClickListener(v ->
                tvRoadmap.setText(
                        "Excel → SQL → Python → Power BI → Machine Learning"));
    }
}

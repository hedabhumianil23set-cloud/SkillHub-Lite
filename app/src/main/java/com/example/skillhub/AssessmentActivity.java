package com.example.skillhub;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AssessmentActivity extends AppCompatActivity {

    CheckBox cbJava, cbDSA, cbDBMS, cbAndroid;
    Button btnCalculate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);

        cbJava = findViewById(R.id.cbJava);
        cbDSA = findViewById(R.id.cbDSA);
        cbDBMS = findViewById(R.id.cbDBMS);
        cbAndroid = findViewById(R.id.cbAndroid);

        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(v -> {

            int score = 0;

            if(cbJava.isChecked()) score += 25;
            if(cbDSA.isChecked()) score += 25;
            if(cbDBMS.isChecked()) score += 25;
            if(cbAndroid.isChecked()) score += 25;

            tvResult.setText("Your Skill Score: " + score + "%");
        });
    }
}

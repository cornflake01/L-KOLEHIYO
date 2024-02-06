package com.example.twotwo_lkolehiyo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class OfficeFacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.office_faculty);

        ImageView backImageView = findViewById(R.id.backImageView);
        backImageView.setOnClickListener(v -> {
            // Navigate back to the categories of offices (fragment_offices.xml)
            finish(); // This will close the current activity and go back to the previous one
        });
    }
}
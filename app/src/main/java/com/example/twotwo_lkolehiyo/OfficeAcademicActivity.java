package com.example.twotwo_lkolehiyo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class OfficeAcademicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.office_academic);

        ImageView backImageView = findViewById(R.id.backImageView);
        backImageView.setOnClickListener(v -> {
            // Navigate back to the categories of offices (fragment_offices.xml)
            finish(); // This will close the current activity and go back to the previous one
        });
    }
}

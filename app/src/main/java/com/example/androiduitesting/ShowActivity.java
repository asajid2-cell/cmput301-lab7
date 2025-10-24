package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Displays the city selected in {@link MainActivity} and offers a back button to return.
 */
public class ShowActivity extends AppCompatActivity {
    public static final String EXTRA_CITY_NAME = "com.example.androiduitesting.EXTRA_CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameView = findViewById(R.id.text_city_name);
        Button backButton = findViewById(R.id.button_back);

        Intent intent = getIntent();
        String cityName = intent != null ? intent.getStringExtra(EXTRA_CITY_NAME) : null;
        if (cityName == null) {
            cityName = "";
        }

        cityNameView.setText(cityName);
        backButton.setOnClickListener(v -> finish());
    }
}

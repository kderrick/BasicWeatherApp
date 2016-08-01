package com.epicodus.theweatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String apiKey = "ab34d8a453d2fdfe605ed5b1cb5609bf";
        double latitude = 37.8267;
        double longittude = -122.423;
        String forecastUrl = "https://api.forecast.io/forecast//,-122.423";

    }
}

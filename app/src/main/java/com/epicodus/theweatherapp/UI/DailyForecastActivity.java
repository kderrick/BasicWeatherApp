package com.epicodus.theweatherapp.UI;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.epicodus.theweatherapp.Adapters.DayAdapter;
import com.epicodus.theweatherapp.R;
import com.epicodus.theweatherapp.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }
}

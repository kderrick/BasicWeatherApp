package com.epicodus.theweatherapp.weather;

import android.util.Log;

import com.epicodus.theweatherapp.R;
import com.epicodus.theweatherapp.UI.MainActivity;
import com.epicodus.theweatherapp.weather.Current;
import com.epicodus.theweatherapp.weather.Day;
import com.epicodus.theweatherapp.weather.Hour;

public class Forecast {

    public static final String TAG = Forecast.class.getSimpleName();

    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Day[] mDailyForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current mCurrent) {
        this.mCurrent = mCurrent;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] mHourlyForecast) {
        this.mHourlyForecast = mHourlyForecast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] mDailyForecast) {
        this.mDailyForecast = mDailyForecast;
    }

    public static int getIconId(String iconString) {

        int iconId = R.mipmap.clear_day;
        Log.d(TAG, iconString + " THIS IS iconString on Forecast.Java class before the if statement in getIconId");

        if (iconString.equals("clear-day")) {
            iconId = R.mipmap.clear_day;
        }
        else if (iconString.equals("clear-night")) {
            iconId = R.mipmap.clear_night;
        }
        else if (iconString.equals("rain")) {
            iconId = R.mipmap.rain;
        }
        else if (iconString.equals("snow")) {
            iconId = R.mipmap.snow;
        }
        else if (iconString.equals("sleet")) {
            iconId = R.mipmap.sleet;
        }
        else if (iconString.equals("wind")) {
            iconId = R.mipmap.wind;
        }
        else if (iconString.equals("fog")) {
            iconId = R.mipmap.fog;
        }
        else if (iconString.equals("cloudy")) {
            iconId = R.mipmap.cloudy;
        }
        else if (iconString.equals("partly-cloudy-day")) {
            iconId = R.mipmap.partly_cloudy;
        }
        else if (iconString.equals("partly-cloudy-night")) {
            iconId = R.mipmap.cloudy_night;
        }
        Log.d(TAG, iconId + ": THIS SHOULD NOT BE NULL BUT IT MAY BE" );
        return iconId;
    }
}

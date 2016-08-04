package com.epicodus.theweatherapp.weather;

import com.epicodus.theweatherapp.weather.Current;
import com.epicodus.theweatherapp.weather.Day;
import com.epicodus.theweatherapp.weather.Hour;

public class Forecast {

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
}

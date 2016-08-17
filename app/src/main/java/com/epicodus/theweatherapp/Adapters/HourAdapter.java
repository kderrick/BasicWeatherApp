package com.epicodus.theweatherapp.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.theweatherapp.R;
import com.epicodus.theweatherapp.weather.Hour;

public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewholder> {

    @Override
    public HourViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(HourViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HourViewholder extends RecyclerView.ViewHolder {
        public TextView mTimeLabel;
        public TextView mSummaryLabel;
        public TextView mTemperatureLabel;
        public ImageView mIconImageView;

        public HourViewholder(View itemView) {
            super(itemView);

            mTimeLabel = (TextView) itemView.findViewById(R.id.timeLabelTextView);
            mSummaryLabel = (TextView) itemView.findViewById(R.id.summaryLabelTextView);
            mTemperatureLabel = (TextView) itemView.findViewById(R.id.temperatureTextView);
            mIconImageView = (ImageView) itemView.findViewById(R.id.iconImageView);
        }

        public void bindHour(Hour hour) {

        }
    }

}

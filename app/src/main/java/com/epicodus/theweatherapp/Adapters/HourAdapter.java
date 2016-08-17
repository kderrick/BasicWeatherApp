package com.epicodus.theweatherapp.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.theweatherapp.R;
import com.epicodus.theweatherapp.weather.Hour;

public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewholder> {

    private Hour[] mHours;
    public HourAdapter(Hour[] hours){
        mHours = hours;

    }

    @Override
    public HourViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hourly_list_item, parent, false);
        HourViewholder viewholder = new HourViewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(HourViewholder holder, int position) {
        holder.bindHour(mHours[position]);
    }

    @Override
    public int getItemCount() {
        return mHours.length;
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
            mTimeLabel.setText(hour.getHour());
            mSummaryLabel.setText(hour.getSummary());
            mTemperatureLabel.setText(hour.getTemperature() + "");
            mIconImageView.setImageResource(hour.getIconId());

        }
    }

}

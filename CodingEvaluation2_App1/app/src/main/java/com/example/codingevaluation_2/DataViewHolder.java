package com.example.codingevaluation_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvDate, mTvPositive, mTVNegative, mTvHospitalized, mTvonVentilatorCurrently,
            mTvDeath, mTvdateChecked;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mTvDate = itemView.findViewById(R.id.tvDate);
        mTvPositive = itemView.findViewById(R.id.tvPositive);
        mTVNegative = itemView.findViewById(R.id.tvNegative);
        mTvHospitalized = itemView.findViewById(R.id.tvHospitalized);
        mTvonVentilatorCurrently = itemView.findViewById(R.id.tvonVentilatorCurrently);
        mTvDeath = itemView.findViewById(R.id.tvdeath);
        mTvdateChecked = itemView.findViewById(R.id.tvdateChecked);
    }

    public void setData(ResponseBody responseBody) {
        mTvDate.setText(responseBody.getDate());
        mTvPositive.setText(responseBody.getPositive());
        mTVNegative.setText(responseBody.getNegative());
        mTvHospitalized.setText(responseBody.getHospitalized());
        mTvonVentilatorCurrently.setText(responseBody.getOnVentilatorCurrently());
        mTvDeath.setText(responseBody.getDeath());
        mTvdateChecked.setText(responseBody.getDateChecked());

    }
}

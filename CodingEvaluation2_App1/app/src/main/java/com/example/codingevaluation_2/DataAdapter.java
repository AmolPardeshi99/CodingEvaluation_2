package com.example.codingevaluation_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {

    private List<ResponseBody> DataList;

    public DataAdapter(List<ResponseBody> dataList) {
        DataList = dataList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new DataViewHolder(view);
    }


    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        ResponseBody responseBody = DataList.get(position);
        holder.setData(responseBody);
    }

    @Override
    public int getItemCount() {
        return DataList.size();
    }
}

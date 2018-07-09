package com.genesoft.easyweather.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.genesoft.easyweather.R;
import com.genesoft.easyweather.model.ForecastBean;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ForecastRecViewAdapter extends RecyclerView.Adapter<ForecastRecViewAdapter.ViewHolder> {

    private List<ForecastBean> forecastDataSource;

    public ForecastRecViewAdapter(ArrayList<ForecastBean> forecastBeenList) {
        this.forecastDataSource = forecastBeenList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_forecast, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastRecViewAdapter.ViewHolder holder, int position) {
        holder.forecastKey.setText(forecastDataSource.get(position).getKey());
        holder.forecastValue.setText(forecastDataSource.get(position).getValue());
    }

    @Override
    public int getItemCount() {
        return forecastDataSource == null ? 0 : forecastDataSource.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.forecastKey)
        TextView forecastKey;

        @BindView(R.id.forecastValue)
        TextView forecastValue;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}

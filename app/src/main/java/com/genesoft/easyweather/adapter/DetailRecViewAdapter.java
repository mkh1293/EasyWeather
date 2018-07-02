package com.genesoft.easyweather.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.genesoft.easyweather.R;
import com.genesoft.easyweather.model.DetailBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailRecViewAdapter extends RecyclerView.Adapter<DetailRecViewAdapter.ViewHolder>{

    private List<DetailBean> detailDataSource;

    public DetailRecViewAdapter(List<DetailBean> detailBeanList) {
        detailDataSource = detailBeanList;
    }

    @Override
    public DetailRecViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detail, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DetailRecViewAdapter.ViewHolder holder, int position) {
        holder.detailParam.setText(detailDataSource.get(position).getParam());
        holder.detailParamValue.setText(detailDataSource.get(position).getValue());
    }

    @Override
    public int getItemCount() {
        return detailDataSource == null ? 0 : detailDataSource.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.detail_param)
        TextView detailParam;

        @BindView(R.id.detail_param_value)
        TextView detailParamValue;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}

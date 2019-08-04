package com.ikayz.travelmantics;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*
Created by ikayz on 04/08/2019
*/
public class DealAdapter {
    public class DealViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;
        public DealViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
        }

        public void bind(TravelDeal deal) {
            tv_title.setText(deal.getTitle());
        }
    }
}

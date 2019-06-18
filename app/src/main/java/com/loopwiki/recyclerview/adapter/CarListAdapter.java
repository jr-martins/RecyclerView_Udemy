package com.loopwiki.recyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.loopwiki.recyclerview.R;
import com.loopwiki.recyclerview.viewholder.CarViewHolder;

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder> {
    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carView = inflater.inflate(R.layout.row_car_list,parent, false);
        return new CarViewHolder(carView);



    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder carViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

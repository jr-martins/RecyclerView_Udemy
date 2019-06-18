package com.loopwiki.recyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.loopwiki.recyclerview.R;
import com.loopwiki.recyclerview.entities.Car;
import com.loopwiki.recyclerview.viewholder.CarViewHolder;

import java.util.List;

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private List<Car> mListCars;

    public CarListAdapter(List<Car> cars){
        this.mListCars = cars;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carView = inflater.inflate(R.layout.row_car_list,parent, false);
        return new CarViewHolder(carView);



    }

    //Metodo chamado todas vez que uma linha é inserida no layout
    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {

        Car car = this.mListCars.get(position);
        holder.bindData(car);


    }

    @Override
    public int getItemCount() {
        return this.mListCars.size();
    }
}

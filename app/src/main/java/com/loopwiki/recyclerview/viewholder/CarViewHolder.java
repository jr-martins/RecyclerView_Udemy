package com.loopwiki.recyclerview.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.loopwiki.recyclerview.R;
import com.loopwiki.recyclerview.entities.Car;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mTextModel = (TextView) itemView.findViewById(R.id.text_model) ;
    }

    public void bindData(Car car){
        this.mTextModel.setText(car.model);


    }
}

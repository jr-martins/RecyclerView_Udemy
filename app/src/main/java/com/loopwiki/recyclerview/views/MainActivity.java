package com.loopwiki.recyclerview.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.loopwiki.recyclerview.R;
import com.loopwiki.recyclerview.adapter.CarListAdapter;
import com.loopwiki.recyclerview.data.CarMock;
import com.loopwiki.recyclerview.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarMock carMock = new CarMock();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());

        // 1 - Obter a recyclerview
        this.mViewHolder.recyclerCars = (RecyclerView) this.findViewById(R.id.recycler_cars);

        //Definir adapter

        CarListAdapter carListAdapter = new CarListAdapter(carList);
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter);

        //Definir um layout
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayout);
    }

    private static class ViewHolder{
        RecyclerView recyclerCars;


    }
}

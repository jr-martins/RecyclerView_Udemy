package com.loopwiki.recyclerview.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.loopwiki.recyclerview.R;
import com.loopwiki.recyclerview.adapter.CarListAdapter;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 - Obter a recyclerview
        this.mViewHolder.recyclerCars = (RecyclerView) this.findViewById(R.id.recycler_cars);

        //Definir adapter

        CarListAdapter carListAdapter = new CarListAdapter();
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter'');
    }

    private static class ViewHolder{
        RecyclerView recyclerCars;


    }
}

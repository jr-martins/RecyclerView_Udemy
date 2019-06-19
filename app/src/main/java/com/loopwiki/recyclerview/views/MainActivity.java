package com.loopwiki.recyclerview.views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.loopwiki.recyclerview.R;
import com.loopwiki.recyclerview.adapter.CarListAdapter;
import com.loopwiki.recyclerview.contants.CarrosContants;
import com.loopwiki.recyclerview.data.CarMock;
import com.loopwiki.recyclerview.entities.Car;
import com.loopwiki.recyclerview.listener.OnListClickInteractionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mContext = this;

        CarMock carMock = new CarMock();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());

        // 1 - Obter a recyclerview
        this.mViewHolder.recyclerCars = (RecyclerView) this.findViewById(R.id.recycler_cars);

        OnListClickInteractionListener listener = new OnListClickInteractionListener() {
            @Override
            public void onClick(int id) {

                Bundle bundle = new Bundle();
                bundle.putInt(CarrosContants.CARRO_ID,id);

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtras(bundle);

                startActivity(intent);


            }
        };

        //Definir adapter

        CarListAdapter carListAdapter = new CarListAdapter(carList, listener);
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter);

        //Definir um layout
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayout);
    }

    private static class ViewHolder{
        RecyclerView recyclerCars;


    }
}

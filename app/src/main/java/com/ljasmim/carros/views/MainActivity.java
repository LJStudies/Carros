package com.ljasmim.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ljasmim.carros.R;
import com.ljasmim.carros.adapter.CarListAdapter;
import com.ljasmim.carros.data.CarMock;
import com.ljasmim.carros.entities.Car;

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

        //Obter RecyclerView
        this.mViewHolder.recyclerCars = (RecyclerView) this.findViewById(R.id.recycler_cars);
        //Definir Adapter
        this.mViewHolder.recyclerCars.setAdapter(new CarListAdapter(carList));
        //Definir Layout
        this.mViewHolder.recyclerCars.setLayoutManager(new LinearLayoutManager(this));

    }

    private static class ViewHolder{
        RecyclerView recyclerCars;
    }
}

package com.ljasmim.carros.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ljasmim.carros.R;
import com.ljasmim.carros.viewholder.CarViewHolder;

/**
 * Created by ljasmim on 25/08/17.
 */

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder>{

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carView = inflater.inflate(R.layout.row_car_list, parent, false);

        return new CarViewHolder(carView);
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

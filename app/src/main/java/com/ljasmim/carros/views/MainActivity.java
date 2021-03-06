package com.ljasmim.carros.views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ljasmim.carros.R;
import com.ljasmim.carros.adapter.CarListAdapter;
import com.ljasmim.carros.constants.CarroConstantes;
import com.ljasmim.carros.data.CarMock;
import com.ljasmim.carros.entities.Car;
import com.ljasmim.carros.listener.OnListClickInteractionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.loadIcon();

        this.mViewHolder = new ViewHolder();
        this.mContext = this;

        //Obtém os dados do Mock
        CarMock carMock = new CarMock(this);
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());

        //Obter RecyclerView
        this.mViewHolder.recyclerCars = (RecyclerView) this.findViewById(R.id.recycler_cars);

        //Implementa método de click para troca de activity
        OnListClickInteractionListener listener = new OnListClickInteractionListener() {
            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(CarroConstantes.CARRO_ID, id);

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        };

        //Definir Adapter
        this.mViewHolder.recyclerCars.setAdapter(new CarListAdapter(carList, listener));

        //Definir Layout
        this.mViewHolder.recyclerCars.setLayoutManager(new LinearLayoutManager(this));
    }

    /***
     * Carrega o icone na tela
     */
    private void loadIcon() {
        getSupportActionBar().setDisplayShowTitleEnabled(true); // Ativa o título
        getSupportActionBar().setDisplayShowHomeEnabled(true); //Ativa Icone
        getSupportActionBar().setIcon(R.mipmap.ic_launcher); // Carrega o Icone
    }

    private static class ViewHolder {
        RecyclerView recyclerCars;
    }
}

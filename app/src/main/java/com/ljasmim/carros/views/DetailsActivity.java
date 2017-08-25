package com.ljasmim.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ljasmim.carros.R;
import com.ljasmim.carros.constants.CarroConstantes;
import com.ljasmim.carros.data.CarMock;
import com.ljasmim.carros.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder;
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mViewHolder = new ViewHolder();
        this.mCarMock = new CarMock();

        this.mViewHolder.textModel = (TextView) this.findViewById(R.id.text_model);
        this.mViewHolder.textPower = (TextView) this.findViewById(R.id.text_power);
        this.mViewHolder.textPrice = (TextView) this.findViewById(R.id.text_price);

        this.getDataFromActivity();
        this.setData();
    }

    /***
     * Carrega os valores do Carro para os elementos de layout
     */
    private void setData() {
        this.mViewHolder.textModel.setText(this.mCar.getModel());
        this.mViewHolder.textPower.setText(String.valueOf(this.mCar.getPower()));
        this.mViewHolder.textPrice.setText(String.valueOf(this.mCar.getPrice()));
    }

    /***
     * Recebe os dados passados pela MainActivity e armazena na variável interna mCar
     */
    private void getDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            this.mCar = this.mCarMock.getById(extras.getInt(CarroConstantes.CARRO_ID));
        }
    }

    private static class ViewHolder{
        TextView textModel;
        TextView textPower;
        TextView textPrice;
    }
}

package com.ljasmim.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ljasmim.carros.R;
import com.ljasmim.carros.entities.Car;
import com.ljasmim.carros.listener.OnListClickInteractionListener;

/**
 * Classe para utilização do padrão ViewHolder pelo RecyclerView, encapsulando os elementos de
 * layout de cada linha da lista.
 * Created by ljasmim on 25/08/17.
 */

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;
    private TextView mTextDetails;
    private ImageView mImageCar;

    public CarViewHolder(View itemView) {
        super(itemView);
        this.mTextModel = (TextView) itemView.findViewById(R.id.text_model);
        this.mTextDetails = (TextView) itemView.findViewById(R.id.text_details);
        this.mImageCar = (ImageView) itemView.findViewById(R.id.image_car);
    }

    /***
     * Carrega a RecyclerView com os dados e com o evento de clique.
     * @param car Objeto com as informações do carro
     * @param listener Implementação do onClickListener que será executada quando uma linha
     *                 do RecyclerView for acionada.
     */
    public void bindData(final Car car, final OnListClickInteractionListener listener) {
        //Ajusta o elemento de interface
        this.mTextModel.setText(car.getModel());
        this.mImageCar.setImageDrawable(car.getPicture());

        //Chama a implementação do método onClick feita na Activity
        this.mTextDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(car.getId());
            }
        });
    }
}

package com.ljasmim.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ljasmim.carros.R;

/**
 * Created by ljasmim on 25/08/17.
 */

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;

    public CarViewHolder(View itemView) {
        super(itemView);

        this.mTextModel = (TextView) itemView.findViewById(R.id.text_model);
    }


}

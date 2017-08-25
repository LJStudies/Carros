package com.ljasmim.carros.listener;

/**
 * Interface para implementação dos métodos de clique de itens na RecyclerView
 * Created by ljasmim on 25/08/17.
 */

public interface OnListClickInteractionListener {
    /***
     * Assinatura do método que executa um evento de clique
     * @param id Identificador do objeto (Carro) acionado.
     */
    public void onClick(int id);

}

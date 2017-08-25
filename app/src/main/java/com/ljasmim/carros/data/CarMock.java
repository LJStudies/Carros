package com.ljasmim.carros.data;

import com.ljasmim.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Mock criado para teste da Classe Car
 * Created by ljasmim on 25/08/17.
 */

public class CarMock {

    private List<Car> mListCar;

    /***
     * Gera a lista de carros para teste
     */
    public CarMock() {
        this.mListCar = new ArrayList<>();
        for (int i = 0; i<100; i++){
            this.mListCar.add(new Car(i,String.valueOf(i), i*10, Double.valueOf(i*100)));
        }
    }

    public List<Car> getList(){
        return this.mListCar;
    }

    public Car getById(int id){
        return this.mListCar.get(id);
    }
}

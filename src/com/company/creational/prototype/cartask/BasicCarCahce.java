package com.company.creational.prototype.cartask;

import java.util.Hashtable;

public class BasicCarCahce {
    public static Hashtable<String, BasicCar> map = new Hashtable<String, BasicCar>();

    public static void loadCache(){
        Ford ford = new Ford();
        ford.setName("Ford 1");
        ford.color("Green");
        map.put(ford.getName(), ford);

        Nano nano = new Nano();
        nano.setName("Nano 1");
        map.put(nano.getName(), nano);
    }

    public static BasicCar getCar(String carName){
        BasicCar clonedCar =  map.get(carName);

        return (BasicCar) clonedCar.clone();
    }
}

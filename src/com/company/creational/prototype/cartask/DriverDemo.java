package com.company.creational.prototype.cartask;

public class DriverDemo {
    public static void main(String[] args){
        BasicCarCahce.loadCache();
        BasicCar car1 = (BasicCar) BasicCarCahce.getCar("Ford 1");
        System.out.println("Car is: " + car1.color("Green")+ " " + car1.getName() + " and it's price is " + car1.getPrice());
        BasicCar car2 = (BasicCar) BasicCarCahce.getCar("Nano 1");
        System.out.println("Car is: " + car2.color("Yellow") + " " + car2.getName() + " and it's price is " + car2.getPrice());

    }
}

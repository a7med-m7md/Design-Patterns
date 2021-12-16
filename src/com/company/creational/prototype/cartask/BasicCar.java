package com.company.creational.prototype.cartask;

abstract class BasicCar implements Cloneable{
    private String name;
    protected String color;
    protected int price = 10000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    abstract String color(String color);

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clone;
    }
}


class Nano extends BasicCar{
    public Nano(){
        price = 1000000;
        setName("Nano");
    }

    public String color(String color){
        this.color = color;
        return this.color;
    }


}

class Ford extends BasicCar{
    public Ford(){
        price = 2000000;
        setName("Ford");
    }

    public String color(String color){
        this.color = color;
        return this.color;
    }


}
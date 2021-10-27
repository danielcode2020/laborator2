package com.company;

public class Sensor extends Arduino {
    public String name;
    public int pins;
    public boolean allBoards; //compatibilitate

    //constructor
    Sensor(double price,int id,String name,int pins,boolean allBoards)
    {
        super(price,id);
        this.name = name;
        this.pins = pins;
        this.allBoards = allBoards;
    }

    @Override
    public String toString() {
        return super.toString() +"Sensor{" +
                "name='" + name + '\'' +
                ", pins=" + pins +
                ", allBoards=" + allBoards +
                '}';
    }
}

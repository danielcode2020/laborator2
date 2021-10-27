package com.company;

public class Arduino {
    public double price;
    public int id;

    //constructor
    Arduino (double price,int id)
    {
        this.price = price;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Arduino{" +
                "price=" + price +
                ", id=" + id +
                '}';
    }
}

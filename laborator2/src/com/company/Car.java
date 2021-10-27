package com.company;

public class Car {
    public String name;
    public String color;
    public double power;
    public double weight;

    // constructor
    Car(String name, String color, double power, double weight)
    {
        this.name = name;
        this.color = color;
        this.power = power;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public double getPower()
    {
        return power;
    }
    public void setPower(double power)
    {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", weight=" + weight +
                '}';
    }
}

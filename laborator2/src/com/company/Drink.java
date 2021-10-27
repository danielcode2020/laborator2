package com.company;

public class Drink {
    private String name;
    private String color;
    private double volume;
    private double price;
    private boolean carbonated;

    //constructor
    Drink(String name, String color, double volume, double price, boolean carbonated)
    {
        this.name = name;
        this.color = color;
        this.volume = volume;
        this.price = price;
        this.carbonated = carbonated;
    }

    //getters
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public double getVolume()
    {
        return volume;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean getCarbonated()
    {
        return carbonated;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setVolume(double volume)
    {
        this.volume = volume;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setCarbonated(boolean carbonated)
    {
        this.carbonated = carbonated;
    }

    public void print()
    {
        System.out.println(name + " " + color + " " + volume + " " + price + " " + carbonated);
    }
}

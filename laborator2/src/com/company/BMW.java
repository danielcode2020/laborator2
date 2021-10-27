package com.company;

public class BMW extends Car{
    public String series;
    public double price;
    public boolean isLuxury;

    //constructor
    protected BMW(String name, String color, double power, double weight,String series,double price,boolean isLuxury)
    {
        super(name,color,power,weight); // in acest caz super se refera la atributele clasei parinte Car
        this.series = series;
        this.price = price;
        this.isLuxury = isLuxury;
    }

    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + "BMW{" +
                "series='" + series + '\'' +
                ", price=" + price +
                ", isLuxury=" + isLuxury +
                '}';
    }
}

package com.company;

public class Board extends Arduino{
    public String name;
    public int pins;
    public int voltageInput;
    public boolean isMicroUsb;

    // constructor
    Board(double price, int id,String name,int pins, int voltageInput,boolean isMicroUsb )
    {
        super(price,id);
        this.name = name;
        this.pins = pins;
        this.voltageInput = voltageInput;
        this.isMicroUsb = isMicroUsb;
    }


    @Override
    public String toString() {
        return super.toString() + "Board{" +
                "name='" + name + '\'' +
                ", pins=" + pins +
                ", voltageInput=" + voltageInput +
                ", isMicroUsb=" + isMicroUsb +
                '}';
    }
}

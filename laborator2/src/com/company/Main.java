package com.company;

public class Main {

    public static void main(String[] args) {
        Grupa gr = new Grupa("fi-201", 2020, 10, true, "romana"); // item 2
        int n = gr.getNumarStudenti();
        System.out.println(n);
        gr.setLimbaStudii("franceza");
        gr.print();

        Drink fanta = new Drink("Fanta", "orange", 1.5, 22.5, false); // item 2
        String s = fanta.getColor();
        System.out.println(s);
        fanta.setPrice(25.99);
        fanta.print();

        Car masina = new Car("audi", "red", 250, 1700); // item 3
        System.out.println(masina.toString());

        BMW x5 = new BMW("bmwx5", "black", 300, 2400, "3", 50999, true); // item 3
        System.out.println(x5.toString());

        Sensor piesa = new Sensor(12.99,2011,"temperature",4,true); // item 4
        System.out.println(piesa.toString());

    }
}

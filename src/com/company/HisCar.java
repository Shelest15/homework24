package com.company;
public class HisCar implements CarInterface {


    @Override
    public void Gas(int g) {
        System.out.println("gas:"+g);
    }
    @Override
    public void Brake(int b){
        System.out.println("brake:"+b);
    }
    @Override
    public void Description(String model, int speed, String color) {
        System.out.println("model:"+ model);
        System.out.println("speed:"+speed);
        System.out.println("color:"+color);
    }
}
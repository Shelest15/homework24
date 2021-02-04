package com.company;

public class Main {

    public static void main(String[] args) {
        MyCar dodge = new MyCar();
        System.out.println("My Car is:");
            dodge.Gas(70);
            dodge.Brake(40);
            dodge.Description();

        HisCar fiat = new HisCar();
            System.out.println("His Car is:");
            fiat.Gas(65);
            fiat.Brake(45);
            fiat.Description("freemont",173,"red");
    }
    }





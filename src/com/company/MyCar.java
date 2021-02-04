package com.company;
public class MyCar extends Car {

            @Override
            public void Gas(int g) {
                System.out.println("gas:" + g);
            }

            @Override
            public void Brake(int b) {
                System.out.println("brake:" + b);
            }

            @Override
            public void Description() {
                System.out.println("model:" + model);
                System.out.println("speed:" + speed);
                System.out.println("color:" + color);
            }
}




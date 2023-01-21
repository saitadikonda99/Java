package com.sai.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Cars car = new Cars();
        Bmw  car1 = new Bmw();
        Audi car2 = new Audi();
        Cars car3 = new Lambo();

        car.Brand();
        car1.Brand();

        }
    }


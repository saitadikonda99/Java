package com.sai.Inheritance.InheritanceDemo.Demo3;

public class Main {

    public static void main(String[] args) {
        Species spec = new Species( "fish");
        spec.sound ();
        Species sai = new Human("sai");
        System.out.println (sai.age);
        sai.sound();
        System.out.println (spec.toString ());
    }
}

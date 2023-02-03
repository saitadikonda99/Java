package com.sai.Inheritance.InheritanceDemo.Demo3;

public class Human extends Species {

    public Human(String name) {
        super ( name );
    }

    @Override
    public void sound() {
        System.out.println ("heyy this human class ");
    }


}

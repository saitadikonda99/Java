package com.sai.Inheritance.InheritanceDemo.Demo3;

public class Species {

    String  cat ;
    int age = 19;
    public Species( String name ) {
        this.cat = name;
    }

    public void sound() {
        System.out.println ("heyy this is parent class ");
    }

    @Override
    public String toString() {
        return "Species{" +
                "cat='" + cat + '\'' +
                ", age=" + age +
                '}';
    }
}

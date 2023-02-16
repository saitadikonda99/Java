package com.sai.prob12;

public class Voter {

    private long ID;
    private String name;
    private int age;

    public Voter( String name , long id , int age ) {
        this.age = age;
        this.ID = id;
        this.name = name;
    }
public long gerID() {
        return ID;
}
    @Override
    public String toString() {
        return "Voter{"  +
                " ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


package com.sai;

public class Code {
        String name;
        int age;
        double salary;

    public Code() {
        this.name    = "sai";
        this.age     = 19;
        this.salary  = 9999999999999.9f;

    }

    public Code( String name, int age , int salary ) {
        this.name    = name;
        this.age     = age;
        this.salary  = salary;
         

    }

    public Code( Code other ) {

        this.name   = other.name;
        this.age    = other.age;
        this.salary = other.salary;
    }
}

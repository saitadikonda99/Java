package com.sai.Abstraction.Demo;

public abstract class Portal {

    private int age;
    private String name;

    public void setName( String name ) {
        this.name = name;
    }
    public  void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void message(String name);


}

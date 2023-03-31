package Cloning;

public class Human {
    String name;
    int age;

    public Human(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public Human (   Human other ) {
        this.name = other.name;
        this.age = other.age;
    }

}

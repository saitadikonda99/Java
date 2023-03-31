package Generics;

public class Animal<T> {
    T name;

    Animal(T name) {
        this.name = name;
    }

    public T hey() {
        System.out.print ( "hey " );
        return name;
    }

}


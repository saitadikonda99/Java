package Abstraction;

public class Main {
    public static void main(String[] args) {

        Son son = new Son();
        son.career ();
        son.partner ();

        Daughter daughter = new Daughter ();

        daughter.career ();
        daughter.partner ();

//        Parent mom = new Abstraction.Parent ();
        Parent.hey ();

        System.out.println (son.name("virat"));
        System.out.println (daughter.name("girl"));
    }
}
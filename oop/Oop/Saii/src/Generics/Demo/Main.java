package Generics.Demo;

public class Main {
    public static void main(String[] args) {

//        Vehicle<Integer> vehi = new Vehicle<> ( 1234 , 70000);

//        vehi.heyy ();

        Vehicle<Integer, String> vehi = new Generics.Demo.Vehicle<> ( "Audi" , 70000);

        vehi.heyy ();
        System.out.println ();

    }
}

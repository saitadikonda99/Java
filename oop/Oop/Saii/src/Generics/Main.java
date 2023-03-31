package Generics;

public class Main {
    public static  void main(String[] args) {
            Animal<Integer> list = new Animal<> ( 5 );

        System.out.println (list.hey ());

    Integer[] arr = { 1, 2, 3, 4, 5 };

        System.out.println (print ( arr ));

    }
    public static <T>  T print( T[] arr) {

        for( T k : arr ) {
            System.out.println (k);
        }
return arr[0];

    }
}

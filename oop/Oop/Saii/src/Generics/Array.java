package Generics;

public class Array {

    public static void main(String[] args) {
        Integer[] arr = { 1, 3, 4, 5, 6, 5};


        print ( arr );
    }

    public static <T> void print(T[] arr ) {
        for( T k : arr ) {
            System.out.println (k);
        }
    }
}

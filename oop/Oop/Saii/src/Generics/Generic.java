package Generics;

public class Generic<T> {
    public static void main(String[] args) {

//        int[] arr = { 1, 2, 3, 4, 5};
//        print ( arr );
//        String[] arr = { "Sai", "Kusuma"};
//        Integer[] arr = {1, 2, 3, 4, 5};
        String[] arr = { "kusuma", "naga sri"};
        print ( arr );

    }
    public static <T> void print( T[] arr ) {

        for (T k : arr ) {
            System.out.print( k + " ");
        }
        }
    }



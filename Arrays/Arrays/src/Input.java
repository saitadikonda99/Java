import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 11;
        arr[2] = 13;
        arr[3] = 22;
        arr[4] =3;
        // [ 5 , 11 , 13 , 22 , 3 ]
        System.out.println(arr[0]);

        // input using for loop
        for( int a=0; a<arr.length; a++ )
            arr[a] = in.nextInt();

        // print using for loop
        // for( int a=0; a<arr.length; a++ )
        // System.out.print(arr[a] + " ");


        System.out.print(Arrays.toString(arr));

        // System.out.print(arr[5]);  ArrayIndexOutOfBoundsException
    }
}
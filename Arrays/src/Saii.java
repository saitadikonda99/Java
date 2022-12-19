import java.util.Arrays;
import java.util.Scanner;
public class Array{
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        System.out.println( "Enter the array size: ");


        int n = in.nextInt();

        int[] arr = new int[n];

        // input the array
        for( int k=0; k<arr.length; k++ ) {
            arr[k] = in.nextInt();
        }

        // print the array
        for( int k=0; k<arr.length; k++ ) {
            System.out.print( Arrays.toString(arr) );
        }
    }
}
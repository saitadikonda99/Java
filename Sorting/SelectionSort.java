import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        // let's say array size is 10
        int[] arr = new int[10];
        for( int k=0; k<arr.length; k++ ) {
            arr[k] = in.nextInt();
        }

        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr ) {
        for( int k=0; k<arr.length; k++ ) {
            // find the last index of the array
            int last = arr.length - k - 1;
            int maxi  = max(arr, last);

            // swap the max element and last index

            int temp  =  arr[last];
            arr[last]  =  arr[maxi];
            arr[maxi] = temp;
        }
    }
    static int max( int[] arr , int last ) {
        int max =  0;
        // find the max element using for loop
        for( int k=0; k<=last; k++ ) {
            if(  arr[max] < arr[k] ) {
                max = k;
            }
        }
        // return the max
        return max;
    }

}


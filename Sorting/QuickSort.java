
// Quick sort in java

import java.util.Arrays;
ublic class QuickSort {
    public static void main( String[] args ) {

        // let's say array size is 5
        int[] arr = { 5, 4, 3, 2, 1};
        sort( arr , 0 , arr.length - 1 );
        System.out.println( Arrays.toString( arr ) );
    }

    static void sort( int[] arr , int low , int hi ) {
        // consider the following
        if( low >= hi ) {
            return;
        }
        int start = low;
        int end   = hi;

        // calculate the mid element

        int mid   = start + ( end - start ) / 2;
        int pivot = arr[mid];
        // run the while loop

        while( start <= end ) {

            // also a reason , why it won't swaped if it is already sorted
hikbn            while( arr[start] < pivot ) {
                start++;
            }
            while( arr[end] > pivot ) {
                end--;
            }
             if( start <= end ) {
                int temp   = arr[start];
                arr[start] = arr[ end ];
                arr[end]   = temp;
                start++;
                end--;
            }
        }

        // now my pivot index is at right index , please sort two halves
        sort( arr, low,end );
        sort( arr, start, hi );

    }
}

// Quick sort in java

import java.util.Arrays;
import java.util.Scanner;
	public class QuickSort {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			// let's say array size is 10 
			int[] arr = new int[10];
			sort( arr , 0 , arr.length - 1 );
			System.out.println( Arrays.toString( arr ) );
			}
	
	static void sort( int[] arr , int low , int hi ) {
		// consider the following 

		int start = low;
		int end   = hi;

		// calculate the mid element 
		
		int mid   = start + ( end - start ) / 2;
		int pivot = arr[pivot];
		// run the while loop 
		
		while( start <= end ) {
	
		// also a reason , why it won't swaped if it is already sorted
		  	if( arr[start] < pivot ) {
				start++;
				}
			if( arr[end] > pivot ) {
				end--;
				}
		while( start <= end ) {
			int temp   = arr[start];
			arr[start] = arr[ end ];
			arr[end]   = temp;
			}
		}

		// now my pivot index is at right index , please sort two halves
		sort( arr, start, hi );
		sort( arr, low,end );
		  
	}
}


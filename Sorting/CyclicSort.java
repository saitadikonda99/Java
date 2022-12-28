// cyclic sort in java 

import java.util.Scanner;
import java.util.Arrays;
	public class CyclicSort {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			// let's say array size is 10
			int[] arr = new int[10];
			// scan the array using for loop
			for( int k=0; k<arr.length; k++ ) {
				arr[k] = in.nextInt();
				}
			Sort( arr );
			System.out.println(Arrays.toString( arr ) );
			}
	static void Sort( int[] arr ) {
		int k=0;

		while( k < arr.length) {
			int correct = arr[k] - 1;

			if( arr[k] != arr[correct] ) {
			// swap the elements
			Swap( arr , k , correct );
				}
			else {
			   k++;
			}
		}
	}
	
	static void Swap( int[] arr , int first , int second ) {
			// swap the elements
			int temp    = arr[first];
			arr[first]  = arr[second];
			arr[second] = temp;
			
			}	
	}
	

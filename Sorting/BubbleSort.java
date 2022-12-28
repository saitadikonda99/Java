// bubble sort in java

import java.util.Arrays;
import java.util.Scanner;
	public class BubbleSort {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			System.out.println("Enter the Array: ");
			// let's say array 10
			int[] arr = new int[10];
			// scan the input using for loop

		for( int k=0; k<arr.length; k++ ) {
			arr[k] = in.nextInt();
			}
		BubbleSort( arr );
			System.out.println(Arrays.toString(arr) );
		}
	
	static void BubbleSort( int[] arr ) {
		
		for( int k=0; k<arr.length-1; k++ ) {
			for( int s=1; s<arr.length-k; s++ ) {
				// if s-1 element is greater than s swap 
				if( arr[s-1] > arr[s] ) {
					int temp = arr[s];
					arr[s]   = arr[s-1];
					arr[s-1] = temp;
					}
				}
			}
		}
	}


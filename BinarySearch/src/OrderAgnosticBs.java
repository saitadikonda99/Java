import java.util.Scanner;
import java.util.Arrays;
	public class OrderAgnosticBs {
		public static void main( String[] args ) {	
			Scanner in = new Scanner( System.in );
			System.out.println("Enter the sorted array: ");
			int[] arr = new int[10];

		// input the array

			for( int k=0; k<arr.length; k++ ) 
				arr[k] = in.nextInt();
			System.out.print("Enter the target element: ");
	
		// input the target

			int target = in.nextInt();
		
		// -1 = not found
			
			int ans = BinarySearch( arr , target );
			System.out.println("index : " + ans );
			
}

	static int BinarySearch( int[] arr , int target ) {
			int start = 0;
			int end   = arr.length - 1;	

// find whether the array is sorted in ascending or descending order

			boolean isAsc = arr[start] < arr[end];			
	
			while( start <= end ) {
			 
			int mid = start + ( end - start ) / 2;
		// if mid equals to target return mid
				if( arr[mid] == target ) 
				  	return mid;
			if( isAsc ) {
			 
				if( arr[mid] > target ) {
					end = mid - 1;
					}
				    else if( arr[mid] < target ) {
					start = mid + 1;
					}
				}
			else {

				if( arr[mid] > target ) {
					start = mid + 1;
					}
					else if( arr[mid] < target ) {
					end = mid -1;
					}
				}
			}

		return -1;
		}

}


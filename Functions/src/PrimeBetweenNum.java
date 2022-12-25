// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;
	public class PrimeBetweenNum {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			System.out.print("Enter the range: ");

			// input the starting range 
			int rangefrom = in.nextInt();
			//input the ending range
			int rangeend = in.nextInt();
			
			// checking whether the number is prime using loop 
			for( int k = rangefrom + 1; k<rangeend; k++ ) {
				if( isPrime( k ) ) {
   					System.out.print( k + " " );
					}
				}
			System.out.println();
		}
		static boolean isPrime( int k )  {
				int prime = 0;
				// if s is prime return s
				for( int s=1; s<=k; s++ ) {
					if( k%s == 0 ) {
						prime++;
						}
					}
			return prime == 2; 		

		}
	}
	

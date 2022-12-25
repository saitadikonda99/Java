// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;
	public class Natural {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			System.out.print("Enter the range: ");
			int range = in.nextInt();
			// sum of natural number answer
			System.out.println( Sum( range ) );
			}
		static int Sum( int range ) {
		 	int sum = 0;
			// calculate the sum using while loop
			int k = 0;
			while( k <= range ) {
				sum +=k;
				k++;
				}
			return sum;
			}
		}
	

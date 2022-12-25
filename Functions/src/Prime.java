// Define a method to find out if a number is prime or not.

import java.util.Scanner;
	public class Prime {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			System.out.print(" Enter the number : ");
			int num = in.nextInt();
			boolean ans = Check( num );
			System.out.println( ans );
			}
	static boolean Check( int num ) {
		int check = 0;
		for( int k=1; k<=num; k++ ) {
			if( num % k == 0 ) {
				check++;
				}
			}
			return check == 2;
			}
		}
	

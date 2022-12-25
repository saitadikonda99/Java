//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;
	public class EvenOdd {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			System.out.print(" Enter the number: " );
			int num = in.nextInt();
			boolean ans = Find( num );
			System.out.println( ans );
		 	}
	static boolean Find( int num ) {
		if( num % 2 == 0 ) {
			return true;
			}
			return false;
		}
	}


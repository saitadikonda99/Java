/* A person is eligible to vote if his/her age is greater than or equal to 18. Define a 
method to find out if he/she is eligible to vote.*/


import java.util.Scanner;
	public class Vote {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			System.out.print(" Enter your age: ");
			int age = in.nextInt();
			boolean ans = Check( age );
			// if eligible true, else false 		
			System.out.println( ans );
			}
	static boolean Check( int age ) {
		// minimum age required to vote is 18 
		if( age >= 18 ) {
			return true;
			}
			return false;
		}
	}
	

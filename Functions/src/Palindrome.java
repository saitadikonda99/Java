// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;
	public class Palindrome {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			System.out.print("Enter the number: ");
			int num = in.nextInt();
			System.out.println(Check( num ) );
			
			}
	static boolean Check( int num ) {
			int temp = num;
			int sum  = 0;
			while ( num > 0 ) {
				int rem = num % 10;
				sum = sum * 10 + rem;
				num = num/10;
				}
			return temp == sum ;
			}	
		}


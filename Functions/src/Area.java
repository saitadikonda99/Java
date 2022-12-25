/* Write a program to print the circumference and area of a circle of radius entered by 
user by defining your own method. */

import java.util.Scanner;
	public class Area {
		public static void main( String[] args ) {
			Scanner in = new Scanner( System.in );
			System.out.print(" Enter the radius: ");
			double radius = in.nextDouble();
			double ans = Circle( radius );
			System.out.println(ans);
		}
	static double Circle( double radius ) {
		
		double area = Math.PI * ( radius * radius );
		return area;
		}
	}


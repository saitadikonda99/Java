/* Define two methods to print the maximum and the minimum number respectively among 
three numbers entered by the user. */

import java.util.Scanner;
public class MaxMin {
	public static void main( String[] args ) {
	Scanner in = new Scanner( System.in );
	System.out.print(" Enter the first number : ");
	int num1 = in.nextInt();
	System.out.print(" Enter the second number : ");
	int num2 = in.nextInt();
	System.out.print(" Enter the third number : ");
	int num3 = in.nextInt();
	int maximum = Max( num1, num2, num3 );
	int minimum = Min( num1, num2, num3 ); 	
 	System.out.println(" Maximum number : " + maximum );
	System.out.println(" Minimum number : " + minimum );
   }
static int Max( int num1, int num2, int num3 ) {
	int max = 0;
	if( num1 > num2 && num1 > num3 ) {
		max = num1;
		}
	else if ( num2 > num1 && num2 > num3 ) {
		max = num2;
		}
	else {
		max = num3;
		}
	return max;

	}
static int Min( int num1, int num2, int num3 ) {	
	int min = 0;
        if( num1 < num2 && num1 < num3 ) {
                min = num1;
                }
        else if ( num2 < num1 && num2 < num3 ) {
                min = num2;
                }
        else {
                min = num3;
                }
        return min;

        }

}

// Define a method that returns the product of two numbers entered by user



import java.util.Scanner;
        public class Product {
                public static void main( String[] args ) {
                        Scanner in = new Scanner( System.in );
                        System.out.print(" Enter the two numbers : ");
                        int num1 = in.nextInt();
                        int num2 = in.nextInt();
                        int ans  = Pro( num1 ,num2 );
                        System.out.println(" Sum of numbers : " + ans );
                        }
        static int Pro( int num1, int num2 ) {
                int pro = num1 * num2;
                return pro;
                }
        }


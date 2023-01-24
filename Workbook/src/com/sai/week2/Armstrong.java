package com.sai.week2;
import java.util.Scanner;
public class Armstrong {

    static boolean isArmstrong(int n ) {

        int original = n;
        int sum =0;
        while(n>0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n /= 10;
        }
        return original == sum;
    }

    static void displayArmstrong( int n ) {
        for( int k=100; k<=n; k++ ) {
            if(isArmstrong ( k )) {
                System.out.print( k + " " );
            }
        }

    }
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt ();
         boolean ans = isArmstrong (n);
         System.out.println (ans);
         displayArmstrong ( n );
    }
}

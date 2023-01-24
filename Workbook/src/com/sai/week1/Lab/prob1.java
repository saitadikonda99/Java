package com.sai.week1.Lab;

// electric bill problem

import java.util.Scanner;
public class prob1 {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        System.out.print("Enter Number of units consumed : ");
        int units = in.nextInt();
        int ans = Bill( units );
        System.out.println(" Bill : " + ans);
    }
    static int Bill( int units ) {
        // check the bill using if else statements
        int bill = 0;
        if( units < 50  ) {
            // if the units are less then 50
            // cost per unit is 2 rs
            bill = units * 2;
        }
        else if( units >=51 && units <=100 ) {
            bill = units * 3;
        }
        else if( units >=101 && units <=300 ) {
            bill = (units * 5 ) + 100;
        }
        else if( units >=301 && units <=450 ) {
            bill = (units * 6 ) + 200;
        }
        else {
            bill = (units * 8 ) + 250;
        }
        return bill;
    }
}
package com.sai.week1.Lab;

// fibonacci series


import java.util.Scanner;
public class prob4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the range: ");
        int n = in.nextInt();
        fibo( n );
    }

    static void fibo( int n ) {

        int n1 =0;
        int n2 =1;
        int n3;
        System.out.print(n1 + " "+ n2+ " " );
        for( int k=2;k<n;k++ ) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

    }
}



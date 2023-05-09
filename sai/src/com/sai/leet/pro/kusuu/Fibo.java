package com.sai.leet.pro.kusuu;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        // Calculate the nth Fibonacci number
        int fn = fibonacci(n);
        System.out.println("F(" + n + ") = " + fn);

        // Print the Fibonacci series up to n
        System.out.print("Fibonacci series up to " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
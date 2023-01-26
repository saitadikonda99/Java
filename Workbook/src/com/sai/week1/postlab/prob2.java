package com.sai.week1.postlab;
import java.util.Scanner;

import static java.lang.System.in;

public class prob2 {
        public static void main(String[] args) {
             Scanner in = new java.util.Scanner ( System.in );
                    int n = in.nextInt ();
                    System.out.println (isPerfect ( n ));
                }
                public static boolean isPerfect ( int n){
                    int sum = 0;
                    for (int k = 1; k < n; k++) {
                        if (n % k == 0) {
                            sum += k;
                        }
                    }
                    return sum == n;
                }
            }



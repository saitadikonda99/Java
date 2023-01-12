package com.sai;

import java.util.ArrayList;

public class DiagonalSum {

        public static void main(String[] args) {
            int[][] mat = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int ans = diagonalSum(mat);
            System.out.println(ans);
        }
        ArrayList<Integer> arr = new ArrayList<>(5);

        static int diagonalSum(int[][] mat) {

            // use two loops two calculate the sum of diagonals
            int sum1 = 0;
            int sum2 = 0;
            for( int k=0; k<mat.length; k++ ) {
                for( int s=0; s<mat.length; s++ ) {
                    if( k == s ) {
                        sum1 += mat[k][s];
                    }
                    if( k + s == mat.length - 1 ) {

                        sum2 += mat[k][s];
                    }
                }
            }
            return sum1+sum2;
        }
    }


package com.sai;

class Convert1DArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int m = 3;
        int n = 3;
        int[][] ans = construct2DArray(original, m, n);

        for (int k = 0; k < m; k++) {
            for (int s = 0; s < n; s++) {
                System.out.print( ans[k][s] + " ");
            }
            System.out.println();
        }
    }
    static int[][] construct2DArray(int[] original, int m, int n) {
        // if the m*n is not equals to the size of
        // the original array then return the empty array
        // it means we cannot convert that 1D array into
        // a 2D array

        if (m * n != original.length) {
            return new int[][] {};
        }

        // m is equals to number of rows
        // n is equals to number of columns
        // create a new 2d array
        int[][] arr = new int[m][n];

        // original array
        // let's say initial size of the array is 0
        int size = 0;
        // use nested loops

        for (int k = 0; k < m; k++) {
            for (int s = 0; s < n; s++) {

                arr[k][s] = original[size];
                // increase the size value
                size++;
            }

        }
        // return the final 2D array

        return arr;
    }
}



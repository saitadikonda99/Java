package com.sai;

public class Transpose {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] mat = transpose(matrix);

        for( int k=0; k < matrix.length; k++ ) {


            for( int s=0; s < matrix[0].length; s++ ) {

                System.out.print(mat[k][s] + " ");

            }
            System.out.println();
        }
    }


    static int[][] transpose(int[][] matrix) {


        // use two loops to print the transpose of matrix

        // initial loop


        int[][] mat = new int[matrix.length][matrix[0].length];
        for( int k=0; k < matrix.length; k++ ) {

            for( int s=0; s < matrix[0].length; s++ ) {

                mat[s][k] = matrix[k][s];
            }
        }


        return mat;

    }
}

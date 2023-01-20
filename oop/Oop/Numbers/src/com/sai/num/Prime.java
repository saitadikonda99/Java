package com.sai.num;

public class Prime extends Num {
    int n;

    Prime(int n) {
        super ( n );
        this.n = n;
        System.out.println ( "this is prime class" );

    }


    @Override
    public boolean check(int n) {
       int count = 0;
         for( int k=1; k<n; k++ ) {
             if( n % k == 0 ) {
                 count++;
             }
         }
        return count == 2;
    }
}

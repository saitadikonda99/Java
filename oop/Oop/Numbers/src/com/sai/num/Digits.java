package com.sai.num;

public class Digits extends Num {

    public Digits(int n) {
        super ( n );
    }

    @Override
    public boolean check(int n) {
        System.out.println ( "this EvenOdd class " );
        boolean b = n % 2 == 0;
        return b;

    }
}


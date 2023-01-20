package com.sai.num;

public class Main {
    public static void main(String[] args)   {
//        Num sai = new Num(29);
//        System.out.println (sai.num1);
        Prime sai = new Prime( 133 );
        boolean n = sai.check ( 122 );
        System.out.println (n);

        EvenOdd evenoddnum = new EvenOdd ( 2 );
        System.out.println (evenoddnum.check ( 24 ));
    }
}
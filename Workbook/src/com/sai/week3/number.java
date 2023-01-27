package com.sai.week3;

public class number {
    int num;

        public void num() {
            this.num = 10;
            System.out.println ("this is method one ");
        }

        public void num( int num ) {
            this.num = num;
            System.out.println ("this is method two ");
    }
    public static void main(String[] args) {
            number sai = new number();

            sai.num();
            sai.num(5);


    }
}


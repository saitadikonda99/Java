package com.sai.generics;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add( int num ) {
        if( isFull(size)) {
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull(int size) {
        boolean b = size == data.length;
        return b;
    }
    public void resize() {
        int[] temp = new int[DEFAULT_SIZE * 2];

        for( int k=0; k<data.length; k++ ) {
            temp[k] = data[k];
        }
        data = temp;
    }

    public void set( int index, int num ) {
        data[index] = num;
        size++;
    }
    public int remove() {
        int remove = data[size--];
        return remove;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + java.util.Arrays.toString ( data ) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.set(2, 13);

//        for( int k=1; k<15; k++ ) {
//            list.add(5 * k );
//        }

        System.out.println (list.toString ());
    }



}

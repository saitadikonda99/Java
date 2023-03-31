package com.sai.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.InsertFirst ( 5 );
        list.InsertFirst ( 6 );
        list.InsertLast ( 13 );
        list.InsertFirst ( 7 );
        list.InsertFirst ( 10 );

        list.Display ();
        list.Size ();
    }

}

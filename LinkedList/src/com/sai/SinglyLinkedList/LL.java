package com.sai.SinglyLinkedList;

public class LL {


    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void InsertFirst( int val ) {
        Node node = new Node (val);
        node.next = head;
        head = node;
        if( tail == null ) {
            tail = head;
        }
        size += 1;
    }

    public void InsertLast( int val ) {
        if( tail == null) {
            InsertFirst ( val );
            return;
            }
        Node node = new Node (val);
        tail.next = node;
        tail = node;
        size +=1;
    }


    public void Size() {
        System.out.println ("Size : " + size);
    }

    public void Display() {

        Node temp = head;

        while( temp != null ) {
            System.out.print( temp.value + " -> " );
            temp = temp.next;
        }
        System.out.println ("End");

    }
    private class Node {
        private int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }
        public Node( int val , Node  next) {
            this.value = val;
            this.next = next;

        }
    }
}

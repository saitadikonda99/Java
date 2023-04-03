package Comparator.demo;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // array list syntax
        ArrayList<Integer> list = new ArrayList<> (5);

        // to add elements
        list.add(5);
        list.add(10);
        list.add(1);

        // print the array
        System.out.println (list);

        java.util.Collections.sort(list);

        System.out.println (list);

        }
    }

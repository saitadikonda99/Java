package com.sai.prob12set2;
import java.util.Scanner;
public class VehicalDemo {

    static Vehicle[] vehi = new com.sai.prob12set2.Vehicle[100];
    static int count = 0;
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner (System.in);

            while( true ) {
o
                System.out.println ("1.Add vehicle");
                System.out.println ("2.display vehicle");
                int ch = in.nextInt ();
                switch (ch) {
                    case 1 -> addVehicle (in);
                    case 2 -> display(in);
                }
            }
    }

   public static void addVehicle(Scanner in) {

       System.out.println ("enter the vehicle no: ");
        int no = in.nextInt ();
       System.out.println ("enter the name : ");
       String name = in.next ();
       System.out.println ("enter the wheeler: ");
       int wheeler = in.nextInt ();
       System.out.println ("enter the mobile no: ");
       long mobile = in.nextLong ();

        vehi[count++]  = new com.sai.prob12set2.Vehicle ( no , wheeler , mobile ,name);
       System.out.println ("vehicle added successfully");
    }
    public static void display(Scanner in) {
        System.out.println ("enter the vehicle number ");
        int vehicleNUm = in.nextInt ();
        for( int k=0; k <count; k++ ) {
            if( vehi[k].getVehicleNO () == vehicleNUm ) {
                System.out.println (vehi[k].toString ());
            }
        }

    }
}

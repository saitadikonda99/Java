package com.sai.prob12;
import java.util.Scanner;
public class VoterDemo {

    static Voter[] voters = new Voter[10];
    static  int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );

        while (true) {
            System.out.println ( "1.Add Voter" );
            System.out.println ( "2.Search Voter" );
            System.out.println ("0.exit");
            System.out.println ( "enter your choice" );
            int ch = in.nextInt ();
            switch (ch) {
                case 1 -> AddVoter (  in );
                case 2 -> ScanVoter ( in );
                case 0 -> System.exit ( 0 );
            }
        }

    }
    public static void AddVoter(Scanner in) {

        if( count == 10 ) {
            System.out.println ("List is FULL");
            return;
        }
        System.out.println ("enter the name :");
        String name = in.next ();
        System.out.println ("enter the id ");
        long id = in.nextLong ();
        System.out.println ("enter the age ");
        int age = in.nextInt ();

        voters[count++] = new Voter (  name  , id , age  );

        System.out.println("Voter added successfully.");
    }

    public static void ScanVoter(Scanner in) {
        System.out.println ("enter the id ");
        long idno = in.nextLong ();
        for( int  k=0; k<count; k++ ) {
            if( voters[k].gerID () == idno ) {
                System.out.println (voters[k]);
                return;
            }
            System.out.println ("voter id not found");
        }

    }

}

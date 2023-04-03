package ExceptionHandiling.Demo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner ( System.in );

        int a  = in.nextInt ();
        int b = in.nextInt ();

        try {
            if( a < 0 | b < 0 ) {
                throw new ExceptionHandiling.Demo.Myexception ( " num is less than zero" );
            }
        } catch( Exception e) {
            System.out.println ( e.getMessage () );
        }finally {
            System.out.println ("exit");
        }
    }

}

package ExceptionHandiling;

public class ExceptionHandling {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        try {
//            divide ( a , b );
//            throw new Exception ("heyy i am throwing this error just for fun");
            // mimicing
            String name = "kusuma";

            if( name.equals ( "kusuma" )) {
                throw new Exception ("name is kusuma");
            }
        } catch (Exception e) {
            System.out.println ( e.getMessage () );
        } finally {
            System.out.println ( "this message will print whatever happens" );
        }
    }
     static int divide( int a, int b  ) throws ArithmeticException {

            if( b == 0 ) {
                throw new ArithmeticException ("error");
            }
            return a/b;
    }
}

public class Concept {
    public static void main(String[] args ) {
        fun(5);
    }
    static void fun( int n ) {
        // base condition
        if( n==0 ) {
            return;
        }
        System.out.println (n);
//        fun ( n -- );

//        n-- vs --n

        fun ( --n );
    }
}

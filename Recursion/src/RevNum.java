public class RevNum {
    public static void main(String[] args) {
        int ans = rev(513);
        System.out.println (ans);
    }
    static int rev( int n ){
        // base condition
        if( n==0 ) {
            return 0;
        }
        return ( ( n % 10 ) ) +  ( rev( n/10 ) * 10 );
    }
}

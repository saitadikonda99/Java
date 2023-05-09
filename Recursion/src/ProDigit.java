public class ProDigit {
    public static void main(String[] args) {
        int ans = pro(1342);
        System.out.println (ans);
    }
    static int pro( int n ) {
        // base condition
        if( n==0 ) {
            return 1;
        }
        return ( n%10 ) * pro( n/10 );
    }
}

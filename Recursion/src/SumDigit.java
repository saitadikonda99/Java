public class SumDigit {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println (ans);
    }
    static  int sum( int n ) {
        // base condition
//        if( n == 0 ) {
//            return 0;
//        }
        if( n%10 == 0 ) {
            return n;
        }
        return (n % 10) + sum( n / 10);
    }
}

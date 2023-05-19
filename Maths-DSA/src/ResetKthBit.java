public class ResetKthBit {
    public static void main(String[] args) {
        int num = 299;
        int k = 4;
        int decimal = ans(num, k);
        String binary = Integer.toBinaryString ( decimal );
        System.out.println ("decimal format :" + decimal);
        System.out.println ("binary format :" +binary);
    }
    static int ans( int num, int k ) {
         int mask = 1 << ( k - 1);
         int compli = ~mask;
         int ans = num & compli;
         return ans;
    }
}

public class CheckKthBit {
    public static void main(String[] args) {
        int num = 299;
         int k = 4;
        System.out.println (ans(num, k));
    }
    static boolean ans(int num, int k ) {
        int mask = 1 << ( k -1 );
        int setNum = num & mask;
        int ans = setNum >> ( k -1 );
        return ans == 1;
    }
}

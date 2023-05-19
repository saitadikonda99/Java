
 public class Codechef
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         java.util.Scanner in = new java.util.Scanner (System.in);
         int t = in.nextInt();
         while( t-- > 0 ) {

             int n = in.nextInt();

             int[] arr = new int[n];
             for( int k=0; k<n; k++ ) {
                 arr[k] = in.nextInt();
             }
             boolean isAp = false;
             for (int s = 0; s < n - 2; s++) {
                 int a = arr[s];

                 for (int ch = s + 1; ch < n - 1; ch++) {
                     int b = arr[ch];
                     int diff = b - a;

                     int r = ch + 1;
                     while (r < n) {
                         int c = arr[r];

                         if (c - b == diff) {
                             isAp = true;
                         } else if (c - b > diff) {
                             break;
                         } else {
                             r++;
                         }
                     }
                 }
             }
    if(isAp) {
        System.out.println ("no");
    } else {
        System.out.println ("yes");
    }
         }
     }
 }

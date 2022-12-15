import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the number : ");
//         int n = in.nextInt();
//         boolean ans = isprime( n );
//         if( ans )                           //to check whether the given number is prime
//             System.out.print("TRUE");
//            else
//             System.out.print("FALSE");

            int n = in.nextInt();
            for( int k=1; k<=n; k++ ) {      //to print the prime numbers upto given range
                if( isprime(k))
                    System.out.print(k + " ");
            }
    }
    static boolean isprime( int n ) {
            int prime = 0;
                for( int k=1; k<=n; k++  ) {
                        if( n%k == 0 )
                            prime++;
                }
                 return prime == 2;
     }
}

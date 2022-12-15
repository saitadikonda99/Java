import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
         int n = in.nextInt();
        for( int k=100; k<=n; k++ ) {
            if (isArmstrong(k))                //to print the armstrong numbers upto given range
                System.out.print(k + " ");
        }
    }
     static boolean isArmstrong( int S) {
        int original = S;
        int sum = 0;
            while( S > 0 ) {
                 int rem = S %10;
                sum += rem * rem * rem;
                 S = S /10;
            }
            return sum==original;
     }
    }

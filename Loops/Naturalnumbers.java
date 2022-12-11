
import java.util.Scanner;
public class Naturalnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number range : ");
        int n  = in.nextInt();

        for( int i = 1; i<=n ; i++ ) {
            System.out.println(i);
        }
    }
}

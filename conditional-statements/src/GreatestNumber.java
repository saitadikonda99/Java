
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("enter the numbers :");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if( a>b && a>c )
            System.out.println("Greatest number : " +a);
        else if (b>a && b>c )
            System.out.println("Greatest number : " +b);
        else
            System.out.println("Greatest number : " +c);

    }
}


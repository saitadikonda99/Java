
import java.util.Scanner;
public class If2 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the number: ");

         int number = in.nextInt();

         if(number > 0 )
             System.out.printf("Positive number\n");
         else
             System.out.printf("Negative number\n");

    }
}

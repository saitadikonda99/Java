
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character:");

        char sai = in.next().trim().charAt(0);
          if( sai >= 97 && sai <= 122 )
              System.out.println("Lower Case");
          else
              System.out.println("Upper Case");
    }
}
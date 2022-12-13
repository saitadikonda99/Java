import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }
        System.out.println("Reverse of number is : " + sum);
    }
}

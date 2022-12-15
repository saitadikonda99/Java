import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is: " + sum);

    }
}
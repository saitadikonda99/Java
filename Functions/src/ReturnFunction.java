import java.util.Scanner;
public class ReturnFunction {
    public static void main(String[] args) {
        int ans = sum();
        //print the answer
        System.out.println("sum is : "+ ans);
    }
    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        //return the sum
        return sum;
    }
}

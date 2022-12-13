import java.util.Scanner;
public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.printf("Enter the number to count: ");
        int target = in.nextInt();
        int rem = 0, count = 0;
        while (num > 0) {
            rem = num % 10;
            if (rem == target)
                count++;
            num = num / 10;
        }
        System.out.println("count is : " + count);

    }
}

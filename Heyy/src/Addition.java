
import java.util.Scanner;
public class Addition {
	public static void main( String[] args ) {
		Scanner in = new Scanner( System.in);
		System.out.print("Enter the two number : ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int sum = num1 + num2;
		
		System.out.println("sum of two numbers: " + sum);
		
	}
}

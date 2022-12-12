import java.util.Scanner;
public class Scannerclass {
        public static void main( String[] args ) {
        Scanner input = new Scanner( System.in );
        System.out.println("enter your name: ");
        String name = input.nextLine();
        System.out.println("enter your age: ");
        int age = input.nextInt();
        System.out.println("enter your gender( F/M )");
        char gender = input.next().charAt(0);
        System.out.println("enter your mobile number: ");
        Long mobile = input.nextLong();

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender :"+gender);
        System.out.println("Mobile number :"+mobile);
        }
}


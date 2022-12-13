
import java.util.Scanner;
public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input the string
        System.out.print("Enter the fruit name : ");
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits ");
            case "grapes" -> System.out.println("Small fruit ");
            case "orange" -> System.out.println("Round fruit ");
            default -> System.out.println("Please enter the valid fruit");
        }
    }
}


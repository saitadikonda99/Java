
import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the salary: ");
        int salary = in.nextInt();

        if( salary < 100000 )
                salary += 2000;
        else if(salary < 200000 && salary>=100000 )
                 salary += 5000;
        else
            salary += 10000;
        System.out.println("salary is : " + salary);
    }
}

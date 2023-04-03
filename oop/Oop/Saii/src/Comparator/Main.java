package Comparator;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        java.util.ArrayList<Student> stu = new java.util.ArrayList<Student> ();

        stu.add ( new Student ( 19, "sai" ) );
        stu.add ( new Student ( 18, "sai1" ) );
        stu.add ( new Student ( 22 , "sai2"));
        stu.add ( new Student ( 37 , "sai3"));
        stu.add ( new Student ( 5 , "sai4"));
        stu.add ( new Student ( 3 , "sai5" ));

        Collections.sort ( stu, new Sorting () );
   
        for (Student s : stu )  {
            System.out.println (s);
        }
    }
}

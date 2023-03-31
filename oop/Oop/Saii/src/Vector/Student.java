import java.util.Scanner;
import java.util.Vector;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;

    public Student(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

 class ClassRepresentative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector<Student> students = new Vector<>();

        // take input for the student details
        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Age: ");
            int age = in.nextInt();
            System.out.print("Address: ");
            String address = in.next();

            students.add(new Student(id, name, age, address));
        }

        // print the details of all the students
        System.out.println("\nDetails of all students:");
        for (Student s : students) {
            System.out.println(s.toString());
        }

        // search for a student using their ID number
        System.out.print("\nEnter ID of student to search: ");
        int searchId = in.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.getId() == searchId) {
                System.out.println("\nStudent found:");
                System.out.println(s.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nStudent not found.");
        }
    }
}

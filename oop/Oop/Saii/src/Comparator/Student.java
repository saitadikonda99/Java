package Comparator;

public class Student {
    Integer age;
    String name;

    public Student( Integer age, String name ) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}'  ;
    }

}

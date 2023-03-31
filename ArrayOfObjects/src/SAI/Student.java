package SAI;

public class Student {

    private String name;
    private long  id;
    private double cgpa;

    public Student( String name, long id, double cgpa ) {
        this.name = name;
        this.id   = id;
        this.cgpa = cgpa;
    }

    public String tostring() {
            return "details: " + "\n" + "name : "+ name + " \n " + "id no: " + id + " \n" + "cgpa: "  +  cgpa;
    }
}

package Abstraction;

public class Daughter extends Parent {
    @Override
    public void career() {
        System.out.println ("I am gonna be a doctor");
    }

    @Override
    public void partner() {
        System.out.println ("I love a boy who cooks food");
    }
    @Override
    public String name( String name ) {
        return name;
    }
}

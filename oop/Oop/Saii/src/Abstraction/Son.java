package Abstraction;

public class Son extends Parent{
    @Override
    public void career() {
        System.out.println ("I am gonna be a coder ");
    }

    @Override
    public void partner() {
        System.out.println ("I love a girl who loves me");
    }

    @Override
    public String name( String name ) {
        return name;
    }
}

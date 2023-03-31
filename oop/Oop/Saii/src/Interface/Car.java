package Interface;

public class Car implements Engine, Brake{

    @Override
    public void stop() {
        System.out.println ("engine stops");
    }

    @Override
    public void start() {
        System.out.println ("engine starts");
    }
}

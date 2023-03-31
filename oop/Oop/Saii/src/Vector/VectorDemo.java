package Vector;

public class VectorDemo {
    public static void main(String[] args) {

         java.util.List<Integer> list = new java.util.Vector<> (5);
         list.add(5);
        list.add(1);
        list.add(10);
        list.add(2004);
        list.add(11);
        Object o =
        list.contains ( 100 );
        System.out.println (o);
        System.out.println (list);



    }
}

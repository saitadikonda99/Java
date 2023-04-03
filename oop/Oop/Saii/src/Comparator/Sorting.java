package Comparator;
import java.util.Comparator;
public class Sorting implements Comparator<Student> {

    @Override
    public int compare( Student o1, Student o2) {

      if( o1.age > o2.age ) {
          return 1;
      }
      else {
          return -1;
      }
//      else {
//        return (o1.age).compareTo(o2.age);
//      }

    }
}

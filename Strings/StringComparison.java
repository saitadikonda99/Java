// string comparison in java

public class StringComparison {
	public static void main(String[] args) {

         String k = "kusuma";
         String s = "kusuma";
         String c = k;

         // ==

         System.out.println( c == k );  // true

         System.out.println( k == s ); // true

         String k1 = new String("kusuma");
         String s1 = new String("kusuma");

         System.out.println( k1 == s1 ); // false

         // it's don't care of objects it only checks the value of two strings

         System.out.println(k1.equals(s1));  // true

     }
 }

public class EvenOdd {
    public static void main(String[] args) {
        // if the number is even
        // print true
        // else print false
        System.out.println (check(5));
    }
    static boolean check(int num ) {
        if( (num & 1) == 1 ) {
            return false;
        }
        return true;
    }
}

public class PrintNum {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers : 1 2 3 4 5\

        print(1);
    }
    public static void print( int num ) {
        // base condition
        if( num == 5 ) {
            System.out.println (5);
            return;
        }
        System.out.println (num);
        print ( num + 1 );
    }
}

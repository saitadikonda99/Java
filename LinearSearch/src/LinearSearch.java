import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for( int k=0; k<5; k ++ ) {
            arr[k] = in.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = in.nextInt();
        int ans = Search( arr , target );
        if( ans != -1 ) {
            System.out.println("Element found at index: " + ans);
        }
        else{
            System.out.println("Element not found");
        }
        }

    static int Search( int[] arr , int target ) {
        if (arr.length == 0) {
            return -1;
        }
        for (int k = 0; k < arr.length; k++) {
            int element = arr[k];
            if (element == target) {
                return k;
            }
        }

        return -1;
    }


}


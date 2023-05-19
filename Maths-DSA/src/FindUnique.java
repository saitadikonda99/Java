public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 1};
        System.out.println (find(arr));
    }
    static int  find(int[] arr ) {
        int unique = 0;
        for (int k : arr) {
            unique ^= k;
        }
        return unique;
    }
}

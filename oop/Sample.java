
public class Sample {
    public static void main(String[] args) {

        Add number = new Add(1, 1);

        int sum = number.a + number.b;
        System.out.println(sum);

        int ans = number.Pro();

        System.out.println(ans);
    }
}    

class Add {
    int a;
    int b;
    public Add(int a, int b) {
        this.a = 5;
        this.b = 13;
    }
    public int Pro() {
        int a = 10;
        int b = 5;
        int ans = a * b ;
        return ans;
    }
}


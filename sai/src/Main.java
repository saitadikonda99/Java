public class Main {

    public static void main(String[] args) {

        int num  = 526;


        System.out.println (isSameAfterReversals ( num ));
    }

        public static boolean isSameAfterReversals(int num) {

            int temp = num;
            int sum  = 0;
            while( temp > 0 ) {
                int rem =  temp % 10;
                sum     =  sum * 10 +  rem;
                temp    /= 10;
            }

            int num2 = 0;
            int num3 = sum;
            while( num3 > 0 ) {
                int rem  =  num3 % 10;
                num2   = num2 * rem;

                num3    /= 10;
            }
            return num2 == sum;
        }
    }
package code;


class Codechef {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};

        int ans = thirdMax ( arr );
        System.out.println (ans);
    }
    public static int thirdMax(int[] nums) {
        int max = nums[0];
        for( int k=0; k<nums.length; k++ ){

            if( max < nums[k])
                max = nums[k];

        }
        int count = 0;
        int min = max;
        for( int k=0; k<nums.length; k++ ){
            if( min >= nums[k])  {
                min = nums[k];
                count++;
            }

            if( count == 3 ) return min;
        }

        return max;
    }

}

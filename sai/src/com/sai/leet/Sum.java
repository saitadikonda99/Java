package com.sai.leet;

public class Sum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
         int[] sai = productExceptSelf ( arr );
        System.out.println ( java.util.Arrays.toString (sai));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];

        for (int k = 0; k < nums.length; k++) {
            int ans = 0;
            for (int s = 0; s < nums.length; s++) {
                if (s != k) {
                    ans *= nums[s];
                }
            }
            arr[k] = ans;
        }
        return arr;
    }
}


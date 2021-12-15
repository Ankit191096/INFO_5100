package com.company;

public class Question3 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 1};
        System.out.println(arraySum(nums, 2));
    }

    public static int arraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                int sum = 0;
                for (int a = i; a < j; a++)
                    sum = sum + nums[i];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }
}

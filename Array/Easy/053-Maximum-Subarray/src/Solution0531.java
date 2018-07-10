/**
 * Given an integer array nums,
 * find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 */

// TODO: 有bug

public class Solution0531 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new Solution0531().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i ++) {
            if (sum < 0) {
                sum = nums[i];
            }
            else
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return sum;
    }
}

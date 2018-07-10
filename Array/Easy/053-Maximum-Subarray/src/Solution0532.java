/**
 * Given an integer array nums,
 * find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 */
public class Solution0532 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new Solution0532().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxEnding = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            maxSum = Math.max(maxSum, maxEnding);
        }
        return maxSum;
    }
}
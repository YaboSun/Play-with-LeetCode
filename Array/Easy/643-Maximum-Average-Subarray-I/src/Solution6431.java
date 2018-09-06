/**
 * Created by hadoop on 18-9-5
 *
 * Given an array consisting of n integers,
 * find the contiguous subarray of given length k that has the maximum average value.
 * And you need to output the maximum average value.
 *
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 */
public class Solution6431 {
    public static void main(String[] args) {
        int[] nums = {9, 7,3,5,6,2,0,8,1,9};
        int k = 6;
        System.out.println(new Solution6431().findMaxAverage(nums, k));
    }

    // 通过了118/123个测试案例，最后的不知道是什么原因，而且运行时间贼久需要优化
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.MIN_VALUE;
        int temp = 0;
        if (nums.length <= k) {
            for (int i = 0; i < nums.length; i++) {
                temp = temp + nums[i];
            }
            maxAverage = (double)temp/k;
            return maxAverage;
        }
        else if (k == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                maxAverage = Math.max(maxAverage, nums[i]);
            }
        }
        else {
            for (int i = 0; i <= nums.length - k; i++) {
                for (int j = i; j < i + k; j++) {
                temp = temp + nums[j];
            }
            double currentMax = (double) temp/k;
            maxAverage = Math.max(maxAverage, currentMax);
            temp = 0;
            }
        }
        return maxAverage;
    }
}

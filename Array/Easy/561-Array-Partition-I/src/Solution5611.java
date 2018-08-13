/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn)
 * which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Input: [1,4,3,2]
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 */
public class Solution5611 {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(new Solution5611().arrayPairSum(nums));
    }

    /**
     * 我感觉题目不好！！！
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        int minSum = 0;
        int j = nums.length - 1;
        for (int i = 0; i < nums.length/2; i++) {
            if (j >= nums.length/2) {
                minSum = minSum + Math.min(nums[i], nums[j]);
                --j;
            }
        }
        return minSum;
    }
}

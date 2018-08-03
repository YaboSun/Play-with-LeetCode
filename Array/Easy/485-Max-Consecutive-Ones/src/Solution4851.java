/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 *
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class Solution4851 {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        new Solution4851().findMaxConsecutiveOnes(nums);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOneSum = 0;
        int count = 0;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            if (nums[0] == 0) {
                return 0;
            } else {
                maxConsecutiveOneSum = 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count ++;
            } else {
                count = 0;
            }
            maxConsecutiveOneSum = Math.max(maxConsecutiveOneSum, count);
        }
        return maxConsecutiveOneSum;
    }
}

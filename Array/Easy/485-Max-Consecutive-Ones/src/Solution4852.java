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
public class Solution4852 {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        new Solution4852().findMaxConsecutiveOnes(nums);
    }

    // discuss的一种方法，感觉和之前的类似 简化了一些
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(count, result);
            }
            else count = 0;
        }

        return result;
    }
}

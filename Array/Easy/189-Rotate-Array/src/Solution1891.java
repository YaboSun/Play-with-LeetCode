/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 * [-1] 2
 */
public class Solution1891 {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 2;
        new Solution1891().rotate(nums, k);
    }

    public void rotate(int[] nums, int k) {
        int[] newNums = new int[nums.length + k];
        for (int i = 0; i < nums.length; i++) {
            int temp = (i + k);
            if (temp >= nums.length) {
                newNums[temp - nums.length] =  nums[i];
            } else {
                newNums[i + k] = nums[i];
            }
        }
        for (int i = 0; i < newNums.length - k && newNums.length - k != 1; i++) {
            nums[i] = newNums[i];
        }
    }
}

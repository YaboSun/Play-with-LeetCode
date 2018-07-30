/**
 * Given an array nums, write a function to move all 0's
 * to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class Solution2831 {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        new Solution2831().moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) == nums.length) {
                break;
            }
            if (nums[i] == 0) {
                count = i;
                for (int j = i +1; j < nums.length; j++) {
                    if (nums[j] ==0) {
                        continue;
                    }
                    temp = nums[count];
                    nums[count] = nums[j];
                    nums[j] = temp;
                    count ++;
                }
            }
        }
    }
}

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 *
 * Input: [1,2,3,1]
 * Output: true
 *
 * Input: [1,2,3,4]
 * Output: false
 *
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class Solution2171 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        new Solution2171().containsDuplicate(nums);
    }

    /**
     * 简单遍历实现
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        boolean hasDuplicate = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
        }
        return hasDuplicate;
    }
}

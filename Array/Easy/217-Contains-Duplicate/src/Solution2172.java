import java.util.Arrays;

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
public class Solution2172 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        new Solution2172().containsDuplicate(nums);
    }

    /**
     * 先排序再查找
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        boolean hasDuplicate = false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i -1]) {
                hasDuplicate = true;
            }
        }
        return hasDuplicate;
    }
}

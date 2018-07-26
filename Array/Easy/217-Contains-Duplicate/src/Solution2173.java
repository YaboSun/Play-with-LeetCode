import java.util.HashSet;
import java.util.Set;

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
public class Solution2173 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        new Solution2173().containsDuplicate(nums);
    }

    /**
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        boolean hasDuplicate = false;
        Set<Integer> distinct = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (distinct.contains(nums[i]))
            hasDuplicate = true;
            distinct.add(nums[i]);
        }
        return hasDuplicate;
    }
}

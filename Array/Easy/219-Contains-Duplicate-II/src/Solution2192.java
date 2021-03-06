import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */

public class Solution2192 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        new Solution2192().containsNearbyDuplicate(nums, k);
    }

    /**
     * 使用hashmap实现
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean hasNearbyDuplicate = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    hasNearbyDuplicate = true;
                }
            }
            map.put(nums[i], i);
        }
        return hasNearbyDuplicate;
    }
}

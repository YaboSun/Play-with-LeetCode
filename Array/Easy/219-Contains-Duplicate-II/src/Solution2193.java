import java.util.HashSet;
import java.util.Set;

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

public class Solution2193 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 3;
        new Solution2193().containsNearbyDuplicate(nums, k);
    }

    /**
     * 使用hashset 不是很懂实现过程
     * @param nums
     * @param k
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean hasNearbyDuplicate = false;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) hasNearbyDuplicate = true;
        }

        return hasNearbyDuplicate;
    }
}

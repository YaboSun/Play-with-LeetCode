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
public class Solution2191 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        new Solution2191().containsNearbyDuplicate(nums, k);
    }

    /**
     * 最容易理解的直接通过比较来得到结果
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int firstIndex, secondIndex;
        boolean hasNearbyDuplicate = false;
        for (firstIndex = 0; firstIndex < nums.length-1; firstIndex++) {
            for (secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex++) {
                if (nums[firstIndex] == nums[secondIndex] && secondIndex - firstIndex <= k) {
                    hasNearbyDuplicate = true;
                    break;
                }
            }
            if (hasNearbyDuplicate) {
                break;
            }
        }
        return hasNearbyDuplicate;
    }
}

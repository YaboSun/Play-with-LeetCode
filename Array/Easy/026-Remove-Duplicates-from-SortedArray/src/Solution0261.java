/**
 * Given a sorted array nums, remove the duplicates in-place such
 * that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this
 * by modifying the input array in-place with O(1) extra memory.
 */
public class Solution0261 {
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int i = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int j = i + 1; j < nums.length; j ++) {
            if (!(nums[i] == nums[j])) {
                count ++;
                i = j;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        int length = Solution0261.removeDuplicates(nums);
        System.out.println(length);
    }
}

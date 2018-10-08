/**
 * Created by hadoop on 18-10-8
 *
 * Given an array with n integers,
 * your task is to check if it could become non-decreasing by modifying at most 1 element.
 *
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 */
public class Solution6651 {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        if (nums.length <= 2) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }
        if (count > 1) {
            return false;
        }
        return true;
    }
}

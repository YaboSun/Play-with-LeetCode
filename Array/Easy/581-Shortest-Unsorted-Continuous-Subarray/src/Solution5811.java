/**
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 * then the whole array will be sorted in ascending order, too.
 * You need to find the shortest such subarray and output its length.
 *
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 */
public class Solution5811 {
    public static void main(String[] args) {
    }

    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, firstIndex = -1, lastIndex = -2, minNum = nums[n-1], maxNum = nums[0];
        for (int i=1;i<n;i++) {
            maxNum = Math.max(maxNum, nums[i]);
            minNum = Math.min(minNum, nums[n-1-i]);
            if (nums[i] < maxNum) lastIndex = i;
            if (nums[n-1-i] > minNum) firstIndex = n-1-i;
        }
        return lastIndex - firstIndex + 1;
    }
}

/**
 * Given an array of integers and an integer k,
 * you need to find the number of unique k-diff pairs in the array.
 * Here a k-diff pair is defined as an integer pair (i, j),
 * where i and j are both numbers in the array and their absolute difference is k.
 *
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of unique pairs.
 *
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 *
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 */
public class Solution5321 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,1};
        int k = 1;
        new Solution5321().findPairs(nums, k);
    }

    //TODO 自己写的测试案例没有全通过
    public int findPairs(int[] nums, int k) {
        int pairNum = 0;
        int temp1 = Integer.MAX_VALUE;
        int temp2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k && nums[j] != temp2) {
                    if (temp2 == nums[i] && temp1 == nums[j]) {
                        continue;
                    } else {
                        pairNum ++;
                        temp1 = nums[i];
                        temp2 = nums[j];
                    }
                }
            }
        }
        return pairNum;
    }
}

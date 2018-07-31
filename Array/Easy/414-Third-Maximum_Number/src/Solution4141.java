import java.util.Arrays;

/**
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * Input: [3, 2, 1]
 * Output: 1
 * Explanation: The third maximum is 1.
 *
 * Input: [1, 2]
 * Output: 2
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 *
 * Input: [2, 2, 3, 1]
 * Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 */
public class Solution4141 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        new Solution4141().thirdMax(nums);
    }

    public int thirdMax(int[] nums) {
        int thirdMaxNum = Integer.MAX_VALUE;
        int count = 0;
        Arrays.sort(nums);
        if (nums.length < 3) {
            thirdMaxNum = nums[nums.length - 1];
        }
        for (int i = nums.length - 1; i > 0; i--) {
             if (nums[i - 1] != nums[i]) {
                 count ++;
             }
            if (count == 2) {
                thirdMaxNum = nums[i -1];
                break;
            } else if (i == 1){
                 thirdMaxNum = nums[nums.length -1];
            }
        }
        return thirdMaxNum;
    }
}

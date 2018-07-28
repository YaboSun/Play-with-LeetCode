/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 *
 * Input: [3,0,1]
 * Output: 2
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 */
public class Solution2681 {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}

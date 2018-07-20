/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Input: [3,2,3]
 * Output: 3
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class Solution1691 {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int majorityElement = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            } else if (count ==0) {
                majorityElement = nums[i];
            } else {
                count--;
            }
        }
        return majorityElement;
    }
}

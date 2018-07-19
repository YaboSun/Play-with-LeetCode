/**
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 *
 * Note:
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class Solution1671 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] index =  new Solution1671().twoSum(numbers, target);
        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i]);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] index = {0, 0};
        int index1 = 0;
        int index2 = 0;
        for (; index1 < numbers.length; index1++) {
            for (index2 = index1 + 1; index2 < numbers.length; index2++) {
                if (numbers[index1] + numbers[index2] == target) {
                    index[0] = ++index1;
                    index[1] = ++index2;
                    break;
                } else if (numbers[index1] + numbers[index2] > target) {
                    break;
                }
            }
        }
        return index;
    }
}

import java.util.Arrays;

/**
 * Created by hadoop on 18-9-4
 *
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 *
 * Input: [1,2,3]
 * Output: 6
 *
 * Input: [1,2,3,4]
 * Output: 24
 *
 * Note:
 * The length of the given array will be in range [3,10^4] and all elements are in the range [-1000, 1000].
 * Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
public class Solution6281 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new Solution6281().maximumProduct(nums));
    }

    public int maximumProduct(int[] nums) {
        int maxProduct = 0;
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        int maxNegative = nums[1];
        int minPositive = nums[nums.length - 3];
        if (maxNegative < 0 && minPositive > 0) {
            maxProduct = Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                    nums[nums.length -1] * nums[nums.length - 2] * nums[nums.length -3]);
        } else if (maxNegative > 0 && minPositive > 0) {
            maxProduct = nums[nums.length -1] * nums[nums.length - 2] * nums[nums.length -3];
        } else if (maxNegative < 0 && minPositive < 0) {
            maxProduct = nums[0] * nums[1] * nums[nums.length - 1];
        } else {
            maxProduct = nums[nums.length -1] * nums[nums.length - 2] * nums[nums.length -3];
        }

        return maxProduct;
    }
}

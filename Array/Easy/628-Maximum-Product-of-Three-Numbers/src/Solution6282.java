/**
 * Created by hadoop on 18-9-5
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

public class Solution6282 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new Solution6282().maximumProduct(nums));
    }

    // 排名第一的discuss解法，其实核心思想都是找到最大的三个数以及最小的俩个数
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE,
                max2 = Integer.MIN_VALUE,
                max3 = Integer.MIN_VALUE,
                min1 = Integer.MAX_VALUE,
                min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}

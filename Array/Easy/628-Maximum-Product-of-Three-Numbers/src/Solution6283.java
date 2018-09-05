import java.util.Arrays;

/**
 * Created by hadoop on 18-9-5
 */
public class Solution6283 {

    // 第一种方式的简化版
    public int maximumProduct(int[] nums) {
        int N = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[N - 1], nums[N - 1] * nums[N - 2] * nums[N - 3]);
    }
}

public class Solution0271 {
    int i = 0;

    public int removeElement(int[] nums, int val) {
        for (int j = 0; j < nums.length; j ++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4};
        int val = 2;
        int length = new Solution0271().removeElement(nums, val);
        System.out.println(length);
    }
}



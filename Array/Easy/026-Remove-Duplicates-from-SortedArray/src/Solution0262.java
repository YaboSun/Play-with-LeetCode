public class Solution0262 {
    public static int[] removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {2, 2, 3, 3};
        int[] newArr = Solution0262.removeDuplicates(nums);
        for (int i = 0; i < newArr.length - 1; i ++ ) {
            System.out.println(newArr[i]);
        }
    }
}

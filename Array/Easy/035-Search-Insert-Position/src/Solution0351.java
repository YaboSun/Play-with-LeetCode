public class Solution0351 {
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] < target) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] testArray = {2, 3, 5, 7};
        int targetValue = 0;
        System.out.println(searchInsert(testArray, targetValue));
    }
}

import java.util.Arrays;

public class Solution0352 {
    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            index = index * (-1) - 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] testArray = {2, 3, 5, 7};
        int targetValue = 5;
        System.out.println(searchInsert(testArray, targetValue));
    }
}

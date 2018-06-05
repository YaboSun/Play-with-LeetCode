/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用
 */
class Solution0012 {
    public static int[] twoSum (int[] array, int target) {
        int[] indices = new int[2];
        int nTwoSum = 0;
        for (int i = 0; i < array.length; i ++) {
            for (int j = i+1; j < array.length -1; j ++){
                nTwoSum = array[i] + array[j];
                if (nTwoSum == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        return indices;
    }
    public static void main(String[] args) {
        int[] testArr = {0, 2, 3, 4, 2};
        int testTarget = 5;
        int[] printIndices;
        printIndices = Solution0012.twoSum(testArr, testTarget);
        for (int index : printIndices) {
            System.out.print(index + " ");
        }
    }
}

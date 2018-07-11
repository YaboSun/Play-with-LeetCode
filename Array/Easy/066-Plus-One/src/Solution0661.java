
/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * 第一次尝试： 简单的将int数组转换为string， 然后转为long进行+1,晓得数据测试通过 但是超过精度的测试数据失败
 */


public class Solution0661 {
    public static void main(String[] args) {
        int[] testArr = {1, 3, 4, 5, 6, 7};
        new Solution0661().plusOne(testArr);
    }

    public int[] plusOne(int[] digits) {

        // 将int数组转换为字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < digits.length; i ++) {
            stringBuilder.append(digits[i]);
        }
        long newDigit = Long.parseLong(stringBuilder.toString()) + 1;
        String newStrDigits = String.valueOf(newDigit);
        int[] plusArray = new int[newStrDigits.length()];
        for (int i = 0; i < newStrDigits.length(); i ++) {
            plusArray[i] = Integer.parseInt(String.valueOf(newStrDigits.charAt(i)));
        }
        return plusArray;
    }
}


/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */


public class Solution0662 {
    public static void main(String[] args) {
        int[] testArr = {9, 9};
        int[] newDigits = new Solution0662().plusOne(testArr);
        for (int i = 0; i < newDigits.length; i ++) {
            System.out.print(newDigits[i]);
        }
    }

    public int[] plusOne(int[] digits) {

        int currIndex = digits.length - 1;
        /**
         * 思路：只获取数组最后一个数字并+1,如果最后一个数字小于9，那么直接相加输出
         * 如果等于9 则前面一位数字进行同样的判断 并将最后一位数字变为0
         */
        for (int i = currIndex; i >= 0; i --){
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int[] newNumber = new int[currIndex + 2];
        newNumber[0] = 1;
        return newNumber;
    }
}

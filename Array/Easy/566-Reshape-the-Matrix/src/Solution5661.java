/**
 * In MATLAB, there is a very useful function called 'reshape',
 * which can reshape a matrix into a new one with different size but keep its original data.
 * You're given a matrix represented by a two-dimensional array,
 * and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 * The reshaped matrix need to be filled with all the elements of the original matrix
 * in the same row-traversing order as they were.
 * If the 'reshape' operation with given parameters is possible and legal,
 * output the new reshaped matrix; Otherwise, output the original matrix.
 *
 * Input:
 * nums =
 * [[1,2],
 * [3,4]]
 * r = 1, c = 4
 * Output:
 * [[1,2,3,4]]
 * Explanation:
 * The row-traversing of nums is [1,2,3,4].
 * The new reshaped matrix is a 1 * 4 matrix,
 * fill it row by row by using the previous list.
 *
 * Input:
 * nums =
 * [[1,2],
 * [3,4]]
 * r = 2, c = 4
 * Output:
 * [[1,2],
 * [3,4]]
 * Explanation:0000000000
 * There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix.
 * So output the original matrix.
 */
public class Solution5661 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        new Solution5661().matrixReshape(nums, r, c);
    }
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] newNums = new int[r][c];
        int n = nums.length;
        int m = nums[0].length;

        if (r * c != n * m) {
            return nums;
        }

        for (int i = 0; i < r * c; i ++) {
            newNums[i / c][i % c] = nums[i / m][i % m];
        }
        return newNums;
    }
}

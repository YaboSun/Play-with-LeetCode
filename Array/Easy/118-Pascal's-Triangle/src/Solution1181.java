import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * Input: 5
 Output:
 [
      [1],
     [1,1],
    [1,2,1],
   [1,3,3,1],
  [1,4,6,4,1]
 ]
 */
public class Solution1181 {
    public static void main(String[] args) {
        int numRows = 5;
        new Solution1181().generate(numRows);
    }

    public List<List<Integer>> generate(int numRows) {
        /**
         * 思路： 外层三角形相当于使用一个ArrayList构建二维数组
         * 内层循环每一层又是新建一个ArrayList
         * 最后将每一层得到的row进行add得到最后的triangle
         */
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i ++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j ++) {
                if (j == 0 || j == i) {
                    row.add(1);
                }
                else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}

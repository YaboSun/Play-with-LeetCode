import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle
 * Note that the row index starts from 0.
 * Example:
 * Input: 3
 * Output: [1,3,3,1]
 */
public class Solution1191 {
    public static void main(String[] args) {

    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i ++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j ++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
        }
        return row;
    }
}

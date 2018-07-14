import java.util.ArrayList;
import java.util.List;

/**
 * @author rheaxu
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
public class Solution1182 {
    public static void main(String[] args) {
        int numRows = 5;
        new Solution1182().generate(numRows);
    }

    public List<List<Integer>> generate (int numRows) {
        List<List<Integer>> allRows = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i ++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j ++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            allRows.add(new ArrayList<Integer>(row));
        }
        return allRows;
    }

/*    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for(int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }*/

}

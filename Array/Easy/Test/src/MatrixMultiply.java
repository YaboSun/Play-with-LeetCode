public class MatrixMultiply{
    public static void main(String[] args) {
        int[][] a = new int[2][3]; // 动态创建一个二维数组
        int[][] b = {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
        int[][] c = new int[2][4];

        // 动态初始化二维数组a
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = (i + 1) * (j + 2);
            }
        }

        // 动态初始化二维数组c
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(c[i][j] + " ");
            }
        }
    }
}
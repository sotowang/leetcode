package 数组.t59;

/**
 * @auther: sotowang
 * @date: 2019/12/05 20:27
 */
public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        if (n == 0) {
            return null;
        }
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = n - 1;
        int count = 1;
        while (count <= n * n) {
            //从左到右
            for (int i = left; i <= right; i++) {
                matrix[up][i] = count++;
            }
            up++;
            //从上向下
            for (int i = up; i <= down; i++) {
                matrix[i][right] = count++;
            }
            right--;
            //从右到左
            for (int i = right; i >= left; i--) {
                matrix[down][i] = count++;
            }
            down--;
            //从下向上
            for (int i = down; i >= up; i--) {
                matrix[i][left] = count++;
            }
            left++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] res = new GenerateMatrix().generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + ",");
            }
            System.out.println();
        }
    }
}

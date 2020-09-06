package 常用算法.其它;
import java.util.Scanner;
/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example  {
    private static int min = Integer.MAX_VALUE;
    private static  int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private static void minPath(int[][] matrix, boolean[][] visited, int row, int col, int n,int sum,int orgin) {
        if (col == n - 1 && row == n - 1) {
            min = Math.min(min, sum);
            return;
        }
        for (int i = 0; i < dirs.length; i++) {
            int x = row + dirs[i][0];
            int y= col + dirs[i][1];
            if (x >= 0 && y >= 0 && x < n && y < n && !visited[x][y]) {
                visited[x][y] = true;
                minPath(matrix, visited, x, y, n, sum + Math.abs(matrix[x][y] - orgin), matrix[row][col]);
                visited[x][y] = false;
            }
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        visited[0][0] = true;
        minPath(matrix, visited, 0, 0, n, 0, matrix[0][0]);
        System.out.println(min);
    }
}

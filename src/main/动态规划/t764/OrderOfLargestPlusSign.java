package 动态规划.t764;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/01/13 21:16
 */
public class OrderOfLargestPlusSign {
    private int[][] dirs = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        if (mines == null || mines.length == 0 || mines[0] == null || mines[0].length == 0) {
            return 1;
        }
        int[][] grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(grid[i], 1);
        }
        for (int i = 0; i < mines.length; i++) {
            grid[mines[i][0]][mines[i][1]] = 0;
        }
        int res = 0;
        //dp使用原数组
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] != 0) {
                    int min = Integer.MAX_VALUE;
                    int exploreLen = Math.min(Math.min(N - 1 - i, N - 1 - j), Math.min(i, j));
                    for (int k = 0; k < dirs.length; k++) {
                        int count = 0;
                        for (int l = 1; l <= exploreLen; l++) {
                            int m = dirs[k][0] == 0 ? dirs[k][0] + i : dirs[k][0]*l + i;
                            int n = dirs[k][1] == 0 ? dirs[k][1] + j : dirs[k][1]*l + j;
                            if (m >= 0 && n >= 0 && m < N && n < N && grid[m][n] != 0) {
                                count++;
                            } else {
                                break;
                            }
                        }
                        min = Math.min(min, count);
                    }
                    grid[i][j] = 1 + min;
                    res = Math.max(grid[i][j], res);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mines5 = {{3, 0}, {3, 3}};
        assert new OrderOfLargestPlusSign().orderOfLargestPlusSign(5, mines5) == 3;
        int[][] mines6 = {{0,0},{0,3},{0,7},{1,1},{1,2},{1,8},{1,9},{2,0},{2,5},{2,6},{2,9},{3,2},{3,4},{3,7},{4,0},{4,3},{4,6},{4,7},{5,0},{5,8},{5,9},{6,2},{6,3},{6,8},{6,9},{7,0},{7,1},{7,5},{7,9},{8,4},{8,9},{9,1},{9,3},{9,4},{9,8},{9,9}};
        assert new OrderOfLargestPlusSign().orderOfLargestPlusSign(10, mines6) == 2;
        int[][] mines4 = {{1, 1}};
        assert new OrderOfLargestPlusSign().orderOfLargestPlusSign(2, mines4) == 1;
        int[][] mines3 = {{0, 0}, {0, 1}, {1, 0}};
        assert new OrderOfLargestPlusSign().orderOfLargestPlusSign(2, mines3) == 1;
        int[][] mines2 = {{0, 0}};
        assert new OrderOfLargestPlusSign().orderOfLargestPlusSign(1, mines2) == 0;
        int[][] mines1 = {};
        assert new OrderOfLargestPlusSign().orderOfLargestPlusSign(2, mines1) == 1;
        int[][] mines = {{4, 2}};
        assert new OrderOfLargestPlusSign().orderOfLargestPlusSign(5, mines) == 2;

    }
}

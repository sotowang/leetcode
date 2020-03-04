package 广度优先搜索.t994;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/3/4 17:36
 */
public class OrangesRotting {
    public int orangesRotting(int[][] grid) {
        int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        ArrayDeque<int[]> queue = new ArrayDeque();
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    //统计新鲜的橘子
                    sum++;
                }
            }
        }
        int step = 0;
        int count = 0;
        while (!queue.isEmpty() && count != sum) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int[] pos = queue.poll();
                for (int i = 0; i < dirs.length; i++) {
                    int m = pos[0] + dirs[i][0];
                    int n = pos[1] + dirs[i][1];
                    if (m >= 0 && n >= 0 && m < grid.length && n < grid[0].length && grid[m][n] == 1) {
                        grid[m][n] = 2;
                        queue.offer(new int[]{m, n});
                        count++;
                    }
                }
            }
            step++;
        }
        return count == sum ? step : -1;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {2, 1, 1}, {1, 1, 0}, {0, 1, 1}
        };
        assert new OrangesRotting().orangesRotting(grid) == 4;
    }
}

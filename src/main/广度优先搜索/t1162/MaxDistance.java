package 广度优先搜索.t1162;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/01/06 21:02
 */
public class MaxDistance {
    public int maxDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return -1;
        }
        LinkedList<int[]> sea = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    sea.offer(new int[]{i, j});
                }
            }
        }
        if (sea.size() == grid.length * grid[0].length || sea.size() == 0) {
            return -1;
        }
        while (!sea.isEmpty()) {

        }
    }
}

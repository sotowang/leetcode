package 堆.t778;

import java.util.PriorityQueue;

/**
 * @auther: sotowang
 * @date: 2020/2/24 16:07
 */
public class SwimInWater {
    private int[][] dirs = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    int res;

    public int swimInWater(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->(grid[a[0]][a[1]]-grid[b[0]][b[1]]));
        minHeap.offer(new int[]{0, 0});
        visited[0][0] = true;
        while (!minHeap.isEmpty()) {
            int[] pos = minHeap.poll();
            res = Math.max(grid[pos[0]][pos[1]], res);
            if (search(grid, pos[0], pos[1], visited,minHeap)) {
                return res;
            }
        }
        return res;
    }

    private boolean search(int[][] grid, int row, int col, boolean[][] visited, PriorityQueue<int[]> minHeap) {
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return true;
        }
        int m, n;
        for (int i = 0; i < dirs.length; i++) {
            m = row + dirs[i][0];
            n = col + dirs[i][1];
            if (m < grid.length && m >= 0 && n < grid[0].length && n >= 0 && !visited[m][n]) {
                minHeap.offer(new int[]{m, n});
                visited[m][n] = true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 1, 2},
                {2, 8, 7},
                {6, 5, 4}
        };
        assert new SwimInWater().swimInWater(grid) == 6;
    }
}

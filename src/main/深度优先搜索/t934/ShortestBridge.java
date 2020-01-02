package 深度优先搜索.t934;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/01/02 11:31
 */
public class ShortestBridge {
    private int[][] direction = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    public int shortestBridge(int[][] A) {
        if (A == null || A.length == 0 || A[0] == null || A[0].length == 0) {
            return 0;
        }
        boolean visitedOnce = false;
        LinkedList<int[]> isLand = new LinkedList<>();
        for (int i = 0; i < A.length && !visitedOnce; i++) {
            for (int j = 0; j < A[0].length && !visitedOnce; j++) {
                if (A[i][j] == 1) {
                    searchIsland(A, i, j ,isLand);
                    visitedOnce = true;
                }
            }
        }

        //bfs
        int step = 0;
        boolean hasZero = false;
        int size = isLand.size();
        int count = 0;
        while (!isLand.isEmpty()) {
            int[] coor = isLand.poll();
            //记录每圈数目
            count++;
            int row = coor[0];
            int col = coor[1];
            for (int k = 0; k < direction.length; k++) {
                int m = direction[k][0] + row;
                int n = direction[k][1] + col;
                if (m >= 0 && m < A.length && n >= 0 && n < A[0].length) {
                    if (A[m][n] == 0) {
                        A[m][n] = 2;
                        hasZero = true;
                        isLand.offer(new int[]{m, n});
                    } else if (A[m][n] == 1) {
                        return step;
                    }
                }
            }
            //一圈以后
            if (count == size) {
                if (hasZero) {
                    step++;
                }
                hasZero = false;
                count = 0;
                size = isLand.size();
            }
        }
        return step;
    }

    private void searchIsland(int[][] A, int i, int j,LinkedList<int[]> isLand) {
        if (A[i][j] == 1) {
            A[i][j] = 2;
            isLand.offer(new int[]{i, j});
        } else {
            return;
        }
        for (int k = 0; k < direction.length; k++) {
            int m = direction[k][0] + i;
            int n = direction[k][1] + j;
            if (m >= 0 && m < A.length && n >= 0 && n < A[0].length) {
                searchIsland(A, m, n, isLand);
            }
        }
    }

    public static void main(String[] args) {
        int[][] A2 = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 0, 1}
        };
        assert new ShortestBridge().shortestBridge(A2) == 2;
        int[][] A1 = {
                {0, 1},
                {1, 0},
        };
        assert new ShortestBridge().shortestBridge(A1) == 1;
        int[][] A = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1}
        };
        assert new ShortestBridge().shortestBridge(A) == 1;
    }
}

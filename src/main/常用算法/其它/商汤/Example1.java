package 常用算法.其它.商汤;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example1 {
    private static int max = 0;
    private static int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static int maxAscPath(int[][] nums, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(nums, i, j, visited, 1);
            }
        }
        return max;
    }

    private static void dfs(int[][] nums, int row, int col, boolean[][] visited,int sum) {
        visited[row][col] = true;
        max = Math.max(sum, max);
        for (int i = 0; i < dirs.length; i++) {
            int m = row + dirs[i][0];
            int n = col + dirs[i][1];
            if (m >= 0 && n >= 0 && m < nums.length && n < nums[0].length && !visited[m][n] && nums[m][n] > nums[row][col]) {
                dfs(nums, m, n, visited,sum+1);
            }
        }
        visited[row][col] = false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] nums = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxAscPath(nums, rows, cols));
    }

}

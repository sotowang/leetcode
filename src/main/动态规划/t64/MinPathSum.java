package 动态规划.t64;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/09 16:45
 * @description:
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0){
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i=1;i<rows;i++){
            grid[i][0] += grid[i-1][0];
        }
        for(int i=1;i<cols;i++){
            grid[0][i] += grid[0][i-1];
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[rows-1][cols-1];
    }

    public static void main(String[] args) {
        System.out.println(new MinPathSum().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
}

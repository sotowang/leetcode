package 深度优先搜索.t329;

/**
 * @auther: sotowang
 * @date: 2020/07/26 17:59
 */
public class LongestIncreasingPath {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0){
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int max = 1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                max = Math.max(dfs(matrix,i,j,dp,dirs),max);
            }
        }
        return max;
    }
    private int dfs(int[][] matrix,int row,int col,int[][] dp,int[][] dirs){
        if(dp[row][col] != 0){
            return dp[row][col];
        }
        dp[row][col] = 1;
        for(int i=0;i<dirs.length;i++){
            int m = row + dirs[i][0];
            int n = col + dirs[i][1];
            if(m >= 0 && n>=0 && m<matrix.length && n<matrix[0].length && matrix[m][n]<matrix[row][col]){
                dp[row][col] = Math.max(dfs(matrix,m,n,dp,dirs)+1,dp[row][col]);
            }
        }
        return dp[row][col];
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{9,9,4},{6,6,8},{2,1,1}};
        assert  new LongestIncreasingPath().longestIncreasingPath(nums) == 4;
    }
}

package 动态规划.t1139;

/**
 * @auther: sotowang
 * @date: 2020/06/13 16:34
 */
public class Largest1BorderedSquare {
    public int largest1BorderedSquare(int[][] grid) {
        int[][] left = new int[grid.length][grid[0].length];
        int max = 0;
        int[][] up = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    left[i][j] = left[i][Math.max(j-1,0)]+1;
                    up[i][j] = up[Math.max(i-1,0)][j] +1;
                    int min = Math.min(left[i][j],up[i][j]);
                    for(int k=min-1;k>=0;k--){
                        if(left[i-k][j]>=k+1 && up[i][j-k] >= k+1){
                            max = Math.max(max,k+1);
                            break;
                        }
                    }
                }
            }
        }
        return max*max;
    }
}

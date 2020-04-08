package 数组.面试题13;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/4/8 15:47
 */
public class MovingCount {
    private int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    private int count = 1;
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        ArrayDeque<int[]> stack = new ArrayDeque();
        stack.push(new int[]{0,0});
        visited[0][0] = true;
        while(!stack.isEmpty()){
            int[] pos = stack.pop();
            int row = pos[0];
            int col = pos[1];
            dfs(visited,row,col,m,n,stack,k);
        }
        return count;
    }
    private void dfs(boolean[][] visited,int row,int col,int m,int n,ArrayDeque<int[]> stack,int k){
        for(int i=0;i<4;i++){
            int p = row+dirs[i][0];
            int q = col+dirs[i][1];

            if(p>=0&&p<m && q>=0 && q<n&& !visited[p][q] &&(calculate(p)+calculate(q)<=k)){
                visited[p][q] = true;
                stack.push(new int[]{p,q});
                count++;
            }
        }
    }
    private int calculate(int x){
        int sum = 0;
        while(x!=0){
            int mod = x%10;
            sum += mod;
            x /=10;
        }
        return sum;
    }
}

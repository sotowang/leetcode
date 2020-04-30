package 深度优先搜索.t1020;

/**
 * @auther: sotowang
 * @date: 2020/4/30 16:18
 */
public class NumEnclaves {
    private int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public int numEnclaves(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int count = 0;
        for(int i=0;i<rows;i++){
            if(A[i][0] == 1){
                dfs(A,i,0);
            }
            if(A[i][cols-1] == 1){
                dfs(A,i,cols-1);
            }
        }
        for(int j=0;j<cols;j++){
            if(A[0][j] == 1){
                dfs(A,0,j);
            }
            if(A[rows-1][j] ==1){
                dfs(A,rows-1,j);
            }
        }
        for(int i=1;i<rows-1;i++){
            for(int j=1;j<cols-1;j++){
                if(A[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int[][] A,int row,int col){
        A[row][col] = 0;
        int rows = A.length;
        int cols = A[0].length;
        for(int i=0;i<dirs.length;i++){
            int m = row+dirs[i][0];
            int n = col+dirs[i][1];
            if(m>=0 && n>=0 && m<rows && n<cols &&A[m][n] == 1){
                dfs(A,m,n);
            }
        }
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{
                {0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1}};
        System.out.println(new NumEnclaves().numEnclaves(A));
    }
}

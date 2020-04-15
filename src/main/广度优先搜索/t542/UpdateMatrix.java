package 广度优先搜索.t542;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/4/15 14:09
 */
public class UpdateMatrix {
    private int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int[][] updateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0){
                    queue.offer(new int[]{i,j});
                }else{
                    matrix[i][j] = rows+cols;
                }
            }
        }
        while(!queue.isEmpty()){
            int[] pos = queue.poll();
            int x = pos[0];
            int y = pos[1];
            search(matrix,x,y,queue);
        }
        return matrix;
    }
    private void search(int[][] matrix,int row,int col,ArrayDeque<int[]> queue){
        for(int i=0;i<4;i++){
            int m = row+dirs[i][0];
            int n = col+dirs[i][1];
            if(m >=0 && n>=0 && m<matrix.length && n<matrix[0].length && matrix[m][n] > matrix[row][col]+1){
                queue.offer(new int[]{m,n});
                matrix[m][n] = matrix[row][col]+1;
            }
        }
    }
}

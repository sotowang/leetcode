package 深度优先搜索.t733;

import java.util.LinkedList;

/**
 * @author: sotowang
 * @date: 2020/08/16 14:30
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int init = image[sr][sc];
        LinkedList<int[]> queue = new LinkedList<>();
        int[][] dirs = {{0,1},{0,-1},{-1,0},{1,0}};
        queue.offer(new int[]{sr,sc});
        while(!queue.isEmpty()){
            int[] tem = queue.poll();
            image[tem[0]][tem[1]] = newColor;
            for(int i=0;i<dirs.length;i++){
                int m = tem[0] + dirs[i][0];
                int n = tem[1] + dirs[i][1];
                if(m>=0 && n>= 0 && m<image.length && n<image[0].length && image[m][n] == init && image[m][n] != newColor){
                    queue.offer(new int[]{m,n});
                }
            }
        }
        return image;
    }
}

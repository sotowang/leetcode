package 排序.t1329;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/4/25 16:35
 */
public class DiagonalSort {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int max = cols;
        int min = -(rows-1);
        LinkedList<Integer> queue = new LinkedList<>();
        for(int dis = min;dis<max;dis++){
            for(int i=0;i<rows;i++){
                if(i+dis<cols && i+dis>=0){
                    queue.offer(mat[i][i+dis]);
                }
            }
            Collections.sort(queue);
            for(int i=0;i<rows;i++){
                if(i+dis<cols && i+dis>=0){
                    mat[i][i+dis] = queue.poll();
                }
            }
        }
        return mat;
    }
}

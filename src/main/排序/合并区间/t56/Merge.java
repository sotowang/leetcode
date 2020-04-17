package 排序.合并区间.t56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/23 20:45
 */
public class Merge {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[][]{};
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int len = intervals.length;
        int left = intervals[0][0];
        int right = intervals[0][1];
        List<int[]> res = new ArrayList<>();
        for(int i=0;i<len-1;i++){
            if(intervals[i+1][0]<=right && right<intervals[i+1][1]){
                right = intervals[i+1][1];
            }
            if(right<intervals[i+1][0]){
                res.add(new int[]{left,right});
                left = intervals[i+1][0];
                right = intervals[i+1][1];
            }
        }
        res.add(new int[]{left,right});
        int size = res.size();
        return res.toArray(new int[size][2]);
    }

    public static void main(String[] args) {
//        int[][] array = new int[][]{{8, 10}, {1, 3}, {2, 6}, {15, 18}};
//        int[][] array = new int[][]{{1, 4}, {4, 5}};
//        int[][] array = new int[][]{{1, 4}, {2, 3}};
        int[][] array = new int[][]{{4, 5}, {2, 3}, {6, 7}, {8, 9}, {1, 10}};
        int[][] res = new Merge().merge(array);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + "," + res[i][1]);
        }
    }
}

package 排序.合并区间.t1288;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/4/24 15:56
 */
public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        int len = intervals.length;
        int index = 0;
        int count = len;
        for(int i=1;i<len;i++){
            if(intervals[i][0]>=intervals[index][0] && intervals[i][1]<=intervals[index][1]){
                count--;
            }else{
                index = i;
            }
        }
        return count;
    }
}

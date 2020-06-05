package 排序.合并区间.t435;

import java.util.Arrays;

/**
 * @author: wangsongtao
 * @date: 2020/06/05 21:09
 */
public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals,(a, b)->(a[1]-b[1]));
        int right = intervals[0][1];
        int count = 1;
        for(int i=0;i<intervals.length;i++){
            //重叠
            if(right > intervals[i][0]){
                continue;
            }else{
                count++;
                right = intervals[i][1];
            }
        }
        return intervals.length-count;
    }
}

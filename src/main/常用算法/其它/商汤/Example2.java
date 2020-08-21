package 常用算法.其它.商汤;


import java.util.Arrays;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example2 {
    public int eraseOverlapIntervals (int[][] intervals) {
        // write code here
        if (intervals == null || intervals.length == 0 || intervals[0] == null || intervals[0].length == 0) {
            return 0;
        }
        int rows = intervals.length;
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        int end = intervals[0][1];
        int count = 1;
        for (int i = 0; i < rows; i++) {
            if (end > intervals[i][0]) {
                continue;
            }else{
                end = intervals[i][1];
                count++;
            }
        }
        return rows-count;
    }
//    public int eraseOverlapIntervals(int[][] intervals) {
//        if(intervals == null || intervals.length == 0){
//            return 0;
//        }
//        Arrays.sort(intervals,(a, b)->(a[1]-b[1]));
//        int right = intervals[0][1];
//        int count = 1;
//        for(int i=0;i<intervals.length;i++){
//            //重叠
//            if(right > intervals[i][0]){
//                continue;
//            }else{
//                count++;
//                right = intervals[i][1];
//            }
//        }
//        return intervals.length-count;
//    }


    public static void main(String[] args) {

    }

}

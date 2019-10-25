package 排序.t57;

import java.util.*;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/23 20:45
 */
public class Insert {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        if ((intervals == null && newInterval == null)) {
            return new int[0][];
        }
        if (intervals == null || intervals.length == 0) {
            res.add(newInterval);
            return res.toArray(new int[0][]);
        }

        if (newInterval == null || newInterval.length == 0) {
            return intervals;
        }

        List<int[]> newIntervals = new ArrayList<>();
        //将插入区间合并入原区间,再比较
        for (int i = 0; i < intervals.length; i++) {
            newIntervals.add(intervals[i]);
        }
        newIntervals.add(newInterval);

        //插入后排序
        Collections.sort(newIntervals, (a, b) -> a[0] - b[0]);
        int left = newIntervals.get(0)[0];
        int right = newIntervals.get(0)[1];
        for (int i = 0; i < newIntervals.size()-1; i++) {
            if (right >= newIntervals.get(i+1)[0]) {
                right = Math.max(Math.max(right, newIntervals.get(i)[1]), newIntervals.get(i + 1)[1]);
            } else {
                res.add(new int[]{left, right});
                left = newIntervals.get(i + 1)[0];
                right = newIntervals.get(i + 1)[1];
            }
        }
        res.add(new int[]{left, right});
        //合并插入区间
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
//        int[][] intervals = new int[][]{{1, 3}, {6, 9}};
//        int[][] intervals = new int[][]{};
        int[][] intervals = new int[][]{{1,5}};
//        int[] newInter = new int[]{2, 5};
        int[] newInter = new int[]{0, 3};
        int[][] res = new Insert().insert(intervals, newInter);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + "," + res[i][1]);
        }
    }
}

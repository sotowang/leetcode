package 常用算法.其它;

import 数组.t228.SummaryRanges;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 extends ClassLoader implements Cloneable {
    private static int max = 0;
    public static void dfs(List<List<Integer>> lists, int[] weight, int sum,int start) {
        if (sum > max) {
            max = sum;
        }
        List<Integer> nowList = lists.get(start);
        int size = nowList.size();
        for (int i = 0; i < size; i++) {
            int index = nowList.get(i);
            dfs(lists, weight, sum + weight[index-1], index - 1);
        }
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[][]{};
        }
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        int len = intervals.length;
        int left = intervals[0][0];
        int right = intervals[0][1];
        List<int[]> res = new ArrayList<>();
        for(int i=0;i<len-1;i++){
            if(intervals[i+1][0]<=right){
                right = intervals[i+1][1];
            }else{
                res.add(new int[]{left,right});
                left = intervals[i+1][0];
                right = intervals[i+1][1];
            }
        }
        res.add(new int[]{left,right});
        return res.toArray(new int[10][]);
    }
    public static void main(String[] args) {
        int n = 244;
        double res = Math.log(n) / Math.log(3);
        res = Math.round(res);
        System.out.println(n - Math.pow(3,res) == 0);


    }
}

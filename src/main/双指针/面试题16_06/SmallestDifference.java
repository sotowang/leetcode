package 双指针.面试题16_06;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/4/23 14:55
 */
public class SmallestDifference {
    public int smallestDifference(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        long min = Integer.MAX_VALUE;
        Arrays.sort(a);
        Arrays.sort(b);
        int la = 0;
        int lb = 0;
        while(la<lenA && lb<lenB){
            min = Math.min(min,Math.abs((long)a[la]-b[lb]));
            if(a[la]<b[lb]){
                la++;
            }else{
                lb++;
            }
        }
        return (int) min;
    }
}

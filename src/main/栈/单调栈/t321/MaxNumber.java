package 栈.单调栈.t321;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/1/31 21:19
 */
public class MaxNumber {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] res = new int[0];
        //nums1看找到长度为i的子序列
        for (int i = 0; i <= k && i <= nums1.length; i++) {
            if (k - i >= 0 && k - i <= nums2.length) {
                int[] tem = merge(subMaxNum(nums1, i), subMaxNum(nums2, k - i));
                if (compare(tem, 0, res, 0)) {
                    res = tem;
                }
            }
        }
        return res;
    }

    /**
     * 单调递减栈
     **/
    private int[] subMaxNum(int[] num, int len) {
        int dropCount = num.length - len;
        int[] res = new int[len];
        int cur = 0;
        for (int i = 0; i < num.length; i++) {
            while (cur > 0 && res[cur - 1] < num[i] && dropCount > 0) {
                dropCount--;
                cur--;
            }
            if (cur < len) {
                res[cur++] = num[i];
            }else{
                dropCount--;
            }
        }

        return res;
    }

    private int[] merge(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int cur = 0;
        int p1 = 0;
        int p2 = 0;
        while (cur < res.length) {
            if(compare(nums1,p1,nums2,p2)){
                res[cur++] = nums1[p1++];
            }else{
                res[cur++] = nums2[p2++];
            }
        }
        return res;
    }

    private boolean compare(int[] nums1, int p1, int[] nums2, int p2) {
        if (p2 >= nums2.length) {
            return true;
        }
        if (p1 >= nums1.length) {
            return false;
        }
        if (nums1[p1] > nums2[p2]){
            return true;
        }else if(nums1[p1] <nums2[p2]){
            return false;
        }else{
            return compare(nums1, p1 + 1, nums2, p2 + 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 7, 6};
        Arrays.stream(new MaxNumber().subMaxNum(nums, 3)).forEach(System.out::println);
    }
}

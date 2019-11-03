package 双指针.t88;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/11/03 21:20
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0 ) {
            return;
        }
        int p = m - 1;
        int q = n - 1;
        int len = m + n-1;
        while (p >= 0 && q >= 0) {
            nums1[len--] = nums1[p] > nums2[q] ? nums1[p--] : nums2[q--];
        }
        System.arraycopy(nums2, 0, nums1, 0, q + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int[] nums3 = new int[]{2,0};
        int[] nums4 = new int[]{1};
//        new Merge().merge(nums1, 3, nums2, 3);
        new Merge().merge(nums3, 1, nums4, 1);
        for (int i : nums1
        ) {
            System.out.println(i);
        }
    }


}

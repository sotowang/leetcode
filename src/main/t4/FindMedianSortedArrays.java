package t4;

/**
 * @author wst
 * @create 2019-09-09 16:42
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int k = (len % 2 == 0 ? len : (len + 1)) / 2;
        return find(nums1, nums2, 0, 0, k/2);

    }

    public double find(int[] nums1, int[] nums2, int start1, int start2, int k) {
        if (k == 0) {
            return (nums1[start1] + nums2[start2]) / 2;
        }

        if (nums1[k - 1] < nums2[k - 1]) {
            start1 = k;
        } else {
            start2 = k;
        }
        return 0.0;

    }
}

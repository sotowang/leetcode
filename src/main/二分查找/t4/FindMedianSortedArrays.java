package 二分查找.t4;


/**
 * @author wst
 * @create 2019-09-09 16:42
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (n % 2 == 1) {
            return findKthElm(nums1, nums2, n / 2 + 1);
        } else {
            return ((double) findKthElm(nums1, nums2, n / 2) + findKthElm(nums1, nums2, n / 2 + 1)) / 2;
        }
    }


    int findKthElm(int[] nums1, int[] nums2, int k) {
        int left = Math.max(0, k - nums2.length);
        int right = Math.min(k, nums1.length);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums2[k - mid - 1] > nums1[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int nums1LeftMax = left == 0 ? Integer.MIN_VALUE : nums1[left - 1];
        int nums2LeftMax = left == k ? Integer.MIN_VALUE : nums2[k - left - 1];
        return Math.max(nums1LeftMax, nums2LeftMax);
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        System.out.println(new FindMedianSortedArrays().findMedianSortedArrays(num1, num2));
    }
}

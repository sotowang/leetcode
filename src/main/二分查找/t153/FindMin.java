package 二分查找.t153;

/**
 * @auther: sotowang
 * @date: 2019/11/20 21:56
 */
public class FindMin {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + high >> 1;
            //最小值在mid-high
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else if (nums[mid] < nums[high]) {//最小值在
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {5, 4, 3, 2, 1};
        System.out.println(new FindMin().findMin(nums1));
        System.out.println(new FindMin().findMin(nums2));
        System.out.println(new FindMin().findMin(nums3));
    }
}

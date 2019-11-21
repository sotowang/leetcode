package 二分查找.t162;

/**
 * @auther: sotowang
 * @date: 2019/11/21 20:29
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + high >> 1;
            //此时峰值一定在右边
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else if (nums[mid] > nums[mid + 1]) { //此时峰值一定在左边
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(new FindPeakElement().findPeakElement(nums));
    }
}

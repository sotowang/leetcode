package 二分查找.t35;

import 二分查找.t34.SearchRange;

/**
 * @auther: sotowang
 * @date: 2019/11/19 21:50
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + high >> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(new SearchInsert().searchInsert(nums, 5));
        System.out.println(new SearchInsert().searchInsert(nums, 2));
        System.out.println(new SearchInsert().searchInsert(nums, 7));
        System.out.println(new SearchInsert().searchInsert(nums, 0));

    }
}

package 二分查找.t81;


/**
 * @auther: sotowang
 * @date: 2019/11/20 20:35
 */
public class Search {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + high >> 1;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] == nums[low] && nums[mid] == nums[high]) {
                low++;
                high--;
            }else if (nums[mid] >=nums[low]) {
                if (nums[low] <= target && nums[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else{
                if (nums[mid] < target && nums[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        System.out.println(new Search().search(nums, 0));
        System.out.println(new Search().search(nums, 3));
//        int[] nums1 = { 1, 3};
//        System.out.println(new Search().search(nums1, 3));
//        System.out.println(new Search().search(nums1, 1));
//        int[] nums2 = { 3,2, 1};
//        System.out.println(new Search().search(nums2, 1));
//        System.out.println(new Search().search(nums2, 3));
//        int[] nums3 = {1, 1, 3, 1};
//        System.out.println(new Search().search(nums3, 1));
//        System.out.println(new Search().search(nums3, 3));

//        int[] nums4 = {4, 5, 6, 7, 0, 1, 2};
//        System.out.println(new Search().search(nums4, 0));
        int[] nums5 = {2, 2, 2, 0, 2, 2};
        System.out.println(new Search().search(nums5, 0));
        System.out.println(new Search().search(nums5, 2));
    }
}

package 二分查找.t34;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/11/19 21:28
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                int count = 0;
                while (mid + count < nums.length || mid - count >= 0) {
                    while (mid + count < nums.length && nums[mid + count] == target) {
                        count++;
                    }
                    res[1] = mid + count - 1;
                    count = 0;
                    while (mid - count >=0 && nums[mid - count] == target) {
                        count++;
                    }
                    res[0] = mid - count + 1;
                    break;
                }
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        Arrays.stream(new SearchRange().searchRange(nums, 8)).forEach(System.out::println);
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        Arrays.stream(new SearchRange().searchRange(nums, 6)).forEach(System.out::println);
        int[] nums = {1};
        Arrays.stream(new SearchRange().searchRange(nums, 1)).forEach(System.out::println);

    }
}

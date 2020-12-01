package 二分查找.t34;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/11/19 21:28
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = -1;
        int right = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+((high-low)>>1);
            if(nums[mid] == target){
                left = mid;
                right = mid;
                while(left>=0 && nums[left] ==target){
                    left--;
                }
                left = Math.max(0,left+1);
                while(right<nums.length && nums[right] == target){
                    right++;
                }
                right = Math.min(right-1,nums.length-1);
                break;
            }else if(nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return new int[]{left,right};
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

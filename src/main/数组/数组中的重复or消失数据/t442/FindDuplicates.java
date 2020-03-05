package 数组.数组中的重复or消失数据.t442;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/29 19:02
 */
public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            } else {
                res.add(Math.abs(nums[i]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{10,2,5,10,9,1,1,4,3,7};
        System.out.println(new FindDuplicates().findDuplicates(nums1));
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(new FindDuplicates().findDuplicates(nums));
    }
}

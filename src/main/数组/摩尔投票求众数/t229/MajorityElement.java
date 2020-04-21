package 数组.摩尔投票求众数.t229;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/07 19:44
 */
public class MajorityElement {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Integer major1 = 0;
        Integer major2 = 0;
        //major1的数量
        int count1 = 0;
        //major2的数量
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == major1) {
                count1++;
            } else if (nums[i] == major2) {
                count2++;
            } else if (count1 == 0) {
                major1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                major2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == major1) {
                count1++;
            }
            if (nums[i] == major2) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            res.add(major1);
        }
        //[2,2]
        if (major1 != major2) {
            if (count2 > nums.length / 3) {
                res.add(major2);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums4 = {2, 2, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9};
        System.out.println(new MajorityElement().majorityElement(nums4));
        int[] nums3 = {2, 2};
        System.out.println(new MajorityElement().majorityElement(nums3));
        int[] nums2 = {1};
        System.out.println(new MajorityElement().majorityElement(nums2));
        int[] nums1 = {3, 2, 3};
        System.out.println(new MajorityElement().majorityElement(nums1));
        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println(new MajorityElement().majorityElement(nums));
    }
}

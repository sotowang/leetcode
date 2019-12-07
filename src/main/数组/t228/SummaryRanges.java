package 数组.t228;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/07 19:20
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int start = nums[0];
        int end = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                continue;
            } else {
                end = nums[i];
                if (start == end) {
                    res.add(String.valueOf(start));
                } else {
                    res.add(start + "->" + end);
                }
                start = nums[i + 1];
                end = nums[nums.length - 1];
            }
        }
        if (start == end) {
            res.add(String.valueOf(start));
        } else {
            res.add(start + "->" + end);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        System.out.println(new SummaryRanges().summaryRanges(nums));
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        System.out.println(new SummaryRanges().summaryRanges(nums1));
    }
}

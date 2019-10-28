package 排序.t179;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/10/28 19:40
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        List<String> list = new ArrayList<>();
        Arrays.stream(nums)
                .mapToObj(e -> String.valueOf(e))
            .forEach(e -> list.add(e));
        StringBuilder res = new StringBuilder();
        //注意顺序
        //当compare>0时,则n1+n2<n2+n1,此时倒序排列n2在n1之前
        list.sort((n1, n2) -> (n2 + n1).compareTo(n1 + n2));
        list.stream().forEach(e -> res.append(e));
        if (res.indexOf("0") == 0) {
            return "0";
        }
        return res.toString();
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{3, 30, 34, 5, 9};
        int[] nums = new int[]{0,0};
        System.out.println(new LargestNumber().largestNumber(nums));
    }
}

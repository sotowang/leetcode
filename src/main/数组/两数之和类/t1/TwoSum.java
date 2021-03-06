package 数组.两数之和类.t1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/12/03 20:46
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 15, 11};
        Arrays.stream(new TwoSum().twoSum(nums, 9))
                .forEach(System.out::println);
    }
}

package 数组.t561;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/06/27 20:42
 */
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i++];
        }
        return sum;
    }
}

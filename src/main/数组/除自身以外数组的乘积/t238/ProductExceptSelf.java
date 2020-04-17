package 数组.除自身以外数组的乘积.t238;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/07 21:11
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int left = 1;
        int right = 1;
        for(int i=0;i<nums.length;i++){
            output[i] = left;
            left *= nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = new ProductExceptSelf().productExceptSelf(nums);
        Arrays.stream(res).forEach(e -> System.out.print(e + " "));
    }
}

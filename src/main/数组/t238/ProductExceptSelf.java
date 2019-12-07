package 数组.t238;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/07 21:11
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        //记录i处左右剩积
        int leftMul = 1;
        int rightMul = 1;
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        for (int i = 0; i < nums.length; i++) {
            res[i] *= leftMul;
            res[nums.length - i - 1] *= rightMul;

            leftMul *= nums[i];
            rightMul *= nums[nums.length - 1 - i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = new ProductExceptSelf().productExceptSelf(nums);
        Arrays.stream(res).forEach(e -> System.out.print(e + " "));
    }
}

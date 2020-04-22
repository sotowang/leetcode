package 数组.子数组.t713;

/**
 * @auther: sotowang
 * @date: 2020/4/22 15:24
 */
public class NumSubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int right = 0;
        int product = 1;
        for(;right<nums.length;right++){
            product *= nums[right];
            while(product>=k && left<=right){
                product /= nums[left++];
            }
            count += right-left+1;
        }
        return  count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 1, 5, 3, 2, 6};
        new NumSubarrayProductLessThanK().numSubarrayProductLessThanK(nums, 100);
    }
}

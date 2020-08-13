package 常用算法.其它.虾皮;


/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            sum = sum < 0 ? 0 : sum;
        }
        return max;
    }


    public static void main(String[] args) {

    }

}

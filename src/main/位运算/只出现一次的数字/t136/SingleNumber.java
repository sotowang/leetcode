package 位运算.只出现一次的数字.t136;

/**
 * @auther: sotowang
 * @date: 2019/11/16 21:36
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int init = nums[0];
        //1^1 = 0
        for (int i = 1; i < nums.length; i++) {
            init ^= nums[i];
        }
        return init;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(new SingleNumber().singleNumber(nums));
    }
}

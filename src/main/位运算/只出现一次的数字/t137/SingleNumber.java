package 位运算.只出现一次的数字.t137;

/**
 * @auther: sotowang
 * @date: 2019/11/16 21:46
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int res = 0;
        //遍历每一位,计算该位1的个数
        for (int j = 0; j < 32; j++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                //判断第j位是否为1
                if (((nums[i] >>> j) & 1) == 1) {
                    count++;
                }
            }
            //若第j位1的个数是3的倍数,则标记为0,否则为1
            if (count % 3 != 0) {
                res = res | 1 << j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 6, 1, 1, 2, 2, 3, 3, 3};
        System.out.println(new SingleNumber().singleNumber(nums));
    }
}

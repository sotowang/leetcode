package 位运算.t268;

/**
 * @auther: sotowang
 * @date: 2019/11/18 21:53
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            //其实求和一个道理 a ^ b ^ b = a
            res ^= i ^ nums[i];
        }
        return res^nums.length;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};
        System.out.println(new MissingNumber().missingNumber(nums));
    }
}

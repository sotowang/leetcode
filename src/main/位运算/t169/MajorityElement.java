package 位运算.t169;

/**
 * @auther: sotowang
 * @date: 2019/11/16 22:14
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int countOne = 0;
            int countZero = 0;
            for (int j = 0; j < nums.length; j++) {
                //nums[j]的第i位是否为1
                if ((nums[j] >>> i & 1) == 1) {
                    countOne++;
                } else {
                    countZero++;
                }
            }
            if (countOne > countZero) {
                res = res | 1 << i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(new MajorityElement().majorityElement(nums));
    }
}

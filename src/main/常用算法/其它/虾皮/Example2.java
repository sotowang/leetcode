package 常用算法.其它.虾皮;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2  {
    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            //其实求和一个道理 a ^ b ^ b = a
            res ^= i ^ nums[i];
        }
        return res^nums.length;
    }
    public static int tryexam() {
        try {
            return 1;
        }finally {
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println(tryexam());

    }
}

package 数学.t1323;

/**
 * @auther: sotowang
 * @date: 2020/1/22 21:38
 */
public class Maximum69Number {
    public int maximum69Number (int num) {
        char[] nums = String.valueOf(num).toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '6') {
                nums[i] = '9';
                break;
            }
        }
        return Integer.valueOf(String.valueOf(nums));
    }

    public static void main(String[] args) {
        assert new Maximum69Number().maximum69Number(9669) == 9969;
        assert new Maximum69Number().maximum69Number(9999) == 9999;
    }
}

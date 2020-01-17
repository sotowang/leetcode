package 数学.t342;

/**
 * @auther: sotowang
 * @date: 2020/01/17 14:15
 */
public class IsPowerOfFour {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (Math.log(num) / Math.log(2)) % 2 == 0;
    }

    public static void main(String[] args) {
        assert new IsPowerOfFour().isPowerOfFour(16) == true;
        assert new IsPowerOfFour().isPowerOfFour(1162261468) == false;
        assert new IsPowerOfFour().isPowerOfFour(1) == true;
        assert new IsPowerOfFour().isPowerOfFour(5) == false;
    }
}

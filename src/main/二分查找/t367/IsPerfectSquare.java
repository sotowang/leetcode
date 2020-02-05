package 二分查找.t367;

/**
 * @auther: sotowang
 * @date: 2020/2/5 15:12
 */
public class IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long sum;
        long left = 1;
        long right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            sum = mid * mid;
            if (sum > num) {
                right = mid - 1;
            } else if (sum < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        assert new IsPerfectSquare().isPerfectSquare(808201) == true;
        assert new IsPerfectSquare().isPerfectSquare(4) == true;
        assert new IsPerfectSquare().isPerfectSquare(1) == true;
        assert new IsPerfectSquare().isPerfectSquare(14) == false;
        assert new IsPerfectSquare().isPerfectSquare(16) == true;
    }
}

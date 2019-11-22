package 二分查找.t278;

/**
 * @auther: sotowang
 * @date: 2019/11/21 21:54
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            //若不这样left+right数据会溢出
            int mid = left + (right-left >> 1);
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(2126753390));
    }

    private boolean isBadVersion(int version) {
        if (version >= 1702766719) {
            return true;
        }
        return false;
    }
}

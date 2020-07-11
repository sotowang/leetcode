package 二分查找.t69;

/**
 * @auther: sotowang
 * @date: 2019/11/20 20:05
 */
public class MySqrt {
    public int mySqrt(int x) {
        if(x == 0 || x== 1){
            return x;
        }
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = left+(right-left>>1);
            if (mid  == x/mid) {
                right = mid;
                break;
            } else if (mid  > x/mid) {
                right = mid - 1;
            } else if (mid < x/mid) {
                left = mid + 1;
            }
        }
        return  right;
    }

    public static void main(String[] args) {
        System.out.println(new MySqrt().mySqrt(8));
        System.out.println(new MySqrt().mySqrt(4));
        System.out.println(new MySqrt().mySqrt(9));
    }
}

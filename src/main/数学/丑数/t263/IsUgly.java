package 数学.丑数.t263;

/**
 * @auther: sotowang
 * @date: 2019/12/16 15:43
 */
public class IsUgly {
    public boolean isUgly(int num) {
        if (num == 1) {
            return true;
        }
        while (true) {
            int temp = num;
            if (num % 2 == 0) {
                num = num >> 1;
            }
            if (num % 3 == 0) {
                num = num / 3;
            }
            if (num % 5 == 0) {
                num = num / 5;
            }
            if (num == 1) {
                return true;
            }
            if (temp == num) {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(new IsUgly().isUgly(14));
        System.out.println(new IsUgly().isUgly(6));
    }
}

package 哈希表.t202;

/**
 * @auther: sotowang
 * @date: 2019/11/23 22:05
 */
public class IsHappy {
    public boolean isHappy(int n) {
        int sum = n;
        while (n != 4 && n != 1) {
            sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(new IsHappy().isHappy(19));
        System.out.println(new IsHappy().isHappy(18));

    }
}

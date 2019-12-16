package 其他.t258;

/**
 * @auther: sotowang
 * @date: 2019/12/16 15:35
 */
public class AddDigits {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

    public static void main(String[] args) {
        System.out.println(new AddDigits().addDigits(38));
    }
}

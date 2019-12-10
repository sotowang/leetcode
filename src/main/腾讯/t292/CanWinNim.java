package 腾讯.t292;

/**
 * @auther: sotowang
 * @date: 2019/12/10 21:31
 */
public class CanWinNim {
    public boolean canWinNim(int n) {
        return n % (4) != 0;
    }

    public static void main(String[] args) {
        System.out.println(new CanWinNim().canWinNim(4));
    }
}

package 其他.t168;

/**
 * @auther: sotowang
 * @date: 2019/12/13 20:42
 */
public class ConvertToTitle {
    public String convertToTitle(int n) {
        if (n < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.insert(0, (char) (--n % 26 + 'A'));
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ConvertToTitle().convertToTitle(26));
        System.out.println(new ConvertToTitle().convertToTitle(27));
    }
}

package 字符串.t67;

/**
 * @auther: sotowang
 * @date: 2019/11/30 12:13
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder stringBuilder;
        //a放大的
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        stringBuilder = new StringBuilder(b);
        int len1 = a.length();
        int len2 = b.length();
        for (int i = 0; i < len1 - len2; i++) {
            stringBuilder.insert(0, 0);
        }
        b = stringBuilder.toString();
        int add = 0;
        StringBuilder res = new StringBuilder();
        for (int i = len1 - 1; i >= 0; i--) {
            int sum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + add;
            add = 0;
            if (sum == 2) {
                add = 1;
                sum = 0;
            } else if (sum == 3) {
                add = 1;
                sum = 1;
            }
            res.insert(0, sum);
        }
        if (add == 1) {
            res.insert(0, 1);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("1111", "1111"));
        System.out.println(new AddBinary().addBinary("11", "1"));
        System.out.println(new AddBinary().addBinary("1010", "1011"));
    }
}

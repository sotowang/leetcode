package 字符串.t8;

/**
 * @auther: sotowang
 * @date: 2019/11/28 21:02
 */
public class MyAtoi {
    public int myAtoi(String str) {
        boolean firstWord = true;
        boolean negative = false;
        boolean begin = false;
        long res = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (firstWord) {
                if (c != ' ' && c != '+' && c != '-' && (c > '9' || c < '0')) {
                    return 0;
                }
                if (c == ' ') {
                    continue;
                }
                if (c == '+') {
                    negative = false;
                    begin = true;
                    firstWord = false;
                } else if (c == '-') {
                    negative = true;
                    begin = true;
                    firstWord = false;
                } else if (c >= '0' && c <= '9') {
                    firstWord = false;
                    begin = true;
                    res = res *10 + Integer.valueOf(c - '0');
                }
            } else {
                if (c == ' ' && (str.charAt(i - 1) == '+' || str.charAt(i - 1) == '-')) {
                    return 0;
                }
                if ( !begin && (c > '9' || c < '0' )) {
                    continue;
                } else if (begin && (c > '9' || c < '0')) {
                    return negative ? (int) res * (-1) : (int) res;
                } else {
                    res = res * 10 + Integer.valueOf(c - '0');
                    if (negative && res * (-1) < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    } else if (!negative && res > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                }
            }
        }
        return negative ? (int) res * (-1) : (int) res;
    }

    public static void main(String[] args) {
        System.out.println(new MyAtoi().myAtoi("-0012a42"));
        System.out.println(new MyAtoi().myAtoi("3.14159"));
        System.out.println(new MyAtoi().myAtoi("-3.14159"));
        System.out.println(new MyAtoi().myAtoi("-91283472332"));
        System.out.println(new MyAtoi().myAtoi("words and 987"));
        System.out.println(new MyAtoi().myAtoi("4193 with words"));
        System.out.println(new MyAtoi().myAtoi("   -43"));
        System.out.println(new MyAtoi().myAtoi("43"));

    }
}

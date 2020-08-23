package 常用算法.其它.米哈游;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    private static String calc(String[] ope) {
        int num1 = ope[0].charAt(0)-'0';
        int deno1 = ope[0].charAt(2)-'0';

        String operate = ope[1];

        int num2 = ope[2].charAt(0)-'0';
        int deno2 = ope[2].charAt(2) - '0';

        if (operate.equals("+")) {
            int x = num1 * deno2 + num2 * deno1;
            int y = deno1 * deno2;
            int common = gcd(x, y);
            if (x / common == y / common) {
                return "1";
            } else if (x / common == -y / common) {
                return "-1";
            }
            return x / common + "/" + y / common;
        } else if (operate.equals("-")) {
            int x = num1 * deno2 - num2 * deno1;
            int y = deno1 * deno2;
            int common = gcd(Math.abs(x), Math.abs(y));
            if (x / common == y / common) {
                return "1";
            }else if (x / common == -y / common) {
                return "-1";
            }
            return x / common + "/" + y / common;
        } else if (operate.equals("*")) {
            int x = num1 * num2;
            int y = deno1 * deno2;
            int common = gcd(x, y);
            if (x / common == y / common) {
                return "1";
            }else if (x / common == -y / common) {
                return "-1";
            }
            return x / common + "/" + y / common;
        } else if (operate.equals("/")) {
            int x = num1 * deno2;
            int y = deno1 * num2;
            int common = gcd(x, y);
            if (x / common == y / common) {
                return "1";
            }else if (x / common == -y / common) {
                return "-1";
            }
            return x / common + "/" + y / common;
        }
        return "";
    }
    private static int  gcd(int m, int n) {
        while (n > 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] operate = str.split(" ");
        System.out.println(calc(operate));
    }

}

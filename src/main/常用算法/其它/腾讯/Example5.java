package 常用算法.其它.腾讯;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example5 {
    private static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            String s = str.substring(l - 1, r);
            System.out.println(count(s));
        }
    }

    private static long count(String str) {
        if (map.containsKey(str) || isPal(str)) {
            map.put(str, 1);
            return 1;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1; j > i; j--) {
                if (map.containsKey(str.substring(i, j)) || isPal(str.substring(i, j))) {
                    long res = 1 + count(str.substring(j));
                    map.put(str, (int) res);
                    return res;
                }
            }
        }
        return str.length();
    }

    private static boolean isPal(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

package 字符串.t13;

import com.sun.org.apache.bcel.internal.generic.PUTFIELD;

import java.util.HashMap;

/**
 * @auther: sotowang
 * @date: 2019/11/29 20:21
 */
public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap(){
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int c1 = map.get(s.charAt(i));
            int c2 = map.get(s.charAt(i+1));
            if (c1 < c2) {
                res += (c2 - c1);
                i++;
            } else {
                res += c1;
            }
        }
         if (s.length() > 1 && map.get(s.charAt(s.length() - 2)) >= map.get(s.charAt(s.length() - 1))) {
            res += map.get(s.charAt(s.length() - 1));
        }
        if (s.length() == 1) {
            res = map.get(s.charAt(0));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("LVIII"));
        System.out.println(new RomanToInt().romanToInt("MCMXCIV"));
    }
}

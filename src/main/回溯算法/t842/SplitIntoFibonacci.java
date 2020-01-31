package 回溯算法.t842;

import sun.rmi.runtime.Log;
import 链表.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/1/29 21:22
 */
public class SplitIntoFibonacci {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res = new ArrayList<>();
        backTrace(S, res, 0);
        return res;
    }

    private boolean backTrace(String s, List<Integer> res, int index) {
        if (index == s.length()) {
            return res.size() > 2;
        }
        for (int i = index + 1; i <= s.length(); i++) {
            String temp = s.substring(index, i);
            if (Long.parseLong(temp) > Integer.MAX_VALUE
                    || (temp.length() != 1 && temp.charAt(0) == '0')) {
                return false;
            }
            int str = Integer.valueOf(temp);
            int one = res.size() >= 2 ? res.get(res.size() - 1) : -1;
            int two = res.size() >= 2 ? res.get(res.size() - 2) : -1;
            if (one != -1 && two != -1 && one + two < str) {
                break;
            }
            res.add(str);
            if ((one == -1 || two == -1 || one + two == str) && backTrace(s, res, i)) {
                return true;
            }
            res.remove(res.size() - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new SplitIntoFibonacci().splitIntoFibonacci("121474836472147483648"));
        System.out.println(new SplitIntoFibonacci().splitIntoFibonacci("1011"));
        System.out.println(new SplitIntoFibonacci().splitIntoFibonacci("539834657215398346785398346991079669377161950407626991734534318677529701785098211336528511"));
        System.out.println(new SplitIntoFibonacci().splitIntoFibonacci("112358130"));
        System.out.println(new SplitIntoFibonacci().splitIntoFibonacci("11235813"));
        System.out.println(new SplitIntoFibonacci().splitIntoFibonacci("123456579"));
    }
}

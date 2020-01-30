package 回溯算法.t842;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/1/29 21:22
 */
public class SplitIntoFibonacci {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res = new ArrayList<>();
        backTrace(S, res, 0, 0);
        return res;
    }

    private void backTrace(String s, List<Integer> res, int start, int end) {
        if (end >= s.length() || start > end) {
            return;
        }
        int sub = Integer.valueOf(s.substring(start, end + 1));
        if (res.size() < 2) {
            res.add(sub);
            backTrace(s, res, end + 1, end + 1);
        } else {
            int val1 = res.get(res.size() - 1);
            int val2 = res.get(res.size() - 2);
            int val = val1 + val2;
            if (val == sub) {
                res.add(sub);
                backTrace(s, res, end + 1, end + 1);
            } else if (val > sub) {
                backTrace(s, res, start, end + 1);
            } else {
                //若当前数>前2个数之和，回退
                res.remove(Integer.valueOf(res.get(res.size() - 1)));
                res.remove(Integer.valueOf(res.get(res.size() - 1)));
                backTrace(s, res, start - String.valueOf(val1).length() - String.valueOf(val2).length(), end );
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(new SplitIntoFibonacci().splitIntoFibonacci("123456579"));
    }
}

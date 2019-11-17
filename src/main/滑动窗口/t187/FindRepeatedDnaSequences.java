package 滑动窗口.t187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/11/17 10:35
 */
public class FindRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.length() < 10) {
            return res;
        }
        int window = 10;
        int left = 0;
        Map<String, Integer> map = new HashMap<>();
        int right = left + window;
        while (right <= s.length()) {
            String temp = s.substring(left, right);
            int count = map.getOrDefault(temp, 0);
            if (count == 1) {
                res.add(temp);
            }
            //去重处理
            map.put(temp, count + 1);
            //将left移至right处
            left++;
            //窗口右移
            right = left + window;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(new FindRepeatedDnaSequences().findRepeatedDnaSequences(s));
    }
}

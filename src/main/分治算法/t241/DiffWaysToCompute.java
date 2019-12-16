package 分治算法.t241;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/12/16 10:55
 */
public class DiffWaysToCompute {
    Map<String, List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String input) {
        if (map.containsKey(input)) {
            return map.get(input);
        }
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (int l : left
                ) {
                    for (int r :
                            right) {
                        if (c == '+') {
                            res.add(l + r);
                        } else if (c == '-') {
                            res.add(l - r);
                        } else if (c == '*') {
                            res.add(l * r);
                        }

                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.parseInt(input));
        }
        map.put(input, res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new DiffWaysToCompute().diffWaysToCompute("2*3-4*5"));
        System.out.println(new DiffWaysToCompute().diffWaysToCompute("2-1-1"));
    }
}

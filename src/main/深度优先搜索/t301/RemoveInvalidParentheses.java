package 深度优先搜索.t301;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/1/28 20:48
 */
public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        backTrace(s.toCharArray(), res, new StringBuilder(), 0, 0, 0);
        return res;
    }

    private void backTrace(char[] chars,
                           List<String> res,
                           StringBuilder str,
                           int index,
                           int startIndex,
                           int endIndex) {
        if (index == chars.length && checkBracket(str)) {
            res.add(str.toString());
            return;
        }
        for (int i = startIndex; i < ; i++) {

        }
        char c = chars[index];
        str.append(c);
        backTrace(chars, res, str, index + 1, deleteIndex + 1);
        str.deleteCharAt(str.length() - 1);
    }

    private boolean checkBracket(StringBuilder str) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveInvalidParentheses().removeInvalidParentheses("()())()"));
    }
}

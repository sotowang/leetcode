package 栈.t394;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/1/4 22:02
 */
public class DecodeString {
    public String decodeString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        LinkedList<String> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                String tempString = "";
                while (!stack.isEmpty() && !stack.peek().equals("[")) {
                    tempString = stack.pop() + tempString;
                }
                if (!stack.isEmpty() && "[".equals(stack.peek())) {
                    stack.pop();
                    int num = Integer.valueOf(stack.pop());
                    for (int j = 0; j < num; j++) {
                        stack.push(tempString);
                    }
                }
            } else {
                int num = 0;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num * 10 + (s.charAt(i) - '0');
                    if (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                        i++;
                    } else {
                        break;
                    }
                }
                if (num > 0) {
                    stack.push(String.valueOf(num));
                } else {
                    stack.push(s.substring(i, i + 1));
                }
            }
        }
        String res = "";
        for (int i = stack.size() - 1; i >= 0; i--) {
            res += stack.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        assert new DecodeString().decodeString("100[leetcode]").equals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode") ;
        assert new DecodeString().decodeString("3[a]2[bc]").equals("aaabcbc") ;
        assert new DecodeString().decodeString("3[a2[c]]").equals("accaccacc") ;
        assert new DecodeString().decodeString("2[abc]3[cd]ef").equals("abcabccdcdcdef") ;
    }
}

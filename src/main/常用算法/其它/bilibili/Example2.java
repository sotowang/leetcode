package 常用算法.其它.bilibili;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2  {
    public static boolean IsValidExp (String s) {
        // write code here
        if (s == null || s.isEmpty()) {
            return true;
        }
        char[] chars = {'(', '[', '{'};
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else{
                if (stack.isEmpty()) {
                    return false;
                }
                char tem = stack.pop();
                if (c == ')' && tem != chars[0]) {
                    return false;
                } else if (c == ']' && tem != chars[1]) {
                    return false;
                } else if (c == '}' && tem != chars[2]) {
                    return false;
                }

            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        System.out.println(IsValidExp("{[]}"));


    }
}

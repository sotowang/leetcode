package 广度优先搜索.t301;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/1/28 20:48
 */
public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        //left,right分别为需要删除的左右括号的数量
        int leftParentheses = 0;
        int rightParentheses = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftParentheses++;
            }
            if (s.charAt(i) == ')') {
                if (leftParentheses > 0) {
                    leftParentheses--;
                } else {
                    rightParentheses++;
                }
            }
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(s);
        //先删除左括号
        while (leftParentheses-- > 0) {
            //存储删除左括号后的字符串
            ArrayList<String> temList = removeParentheses(arrayList, '(');
            //将删除括号后的字符串给arrayList进行新一轮的删除
            arrayList = temList;
        }
        //再删除右括号
        while (rightParentheses-- > 0) {
            ArrayList<String> temList = removeParentheses(arrayList, ')');
            //将删除括号后的字符串给arrayList进行新一轮的删除
            arrayList = temList;
        }
        List<String> res = new ArrayList<>();
        for (String str :
                arrayList) {
            if (checkParentheses(str)) {
                res.add(str);
            }
        }
        return res;
    }

    private ArrayList<String> removeParentheses(ArrayList<String> arrayList, char c) {
        //存储删除右括号后的字符串
        ArrayList<String> temList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String temS = arrayList.get(i);
            for (int j = 0; j < temS.length(); j++) {
                if (temS.charAt(j) == c) {
                    String subStr = temS.substring(0, j) + temS.substring(j + 1);
                    if (!temList.contains(subStr)) {
                        temList.add(subStr);
                    }
                }
            }
        }
        return temList;
    }

    private boolean checkParentheses(String parentheses) {
        if (parentheses.length() == 0) {
            return true;
        } else if (parentheses.charAt(0) == ')') {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == '(') {
                stack.push('(');
            } else if (parentheses.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (stack.isEmpty()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new RemoveInvalidParentheses().removeInvalidParentheses(")("));
        System.out.println(new RemoveInvalidParentheses().removeInvalidParentheses("()())()"));
    }
}

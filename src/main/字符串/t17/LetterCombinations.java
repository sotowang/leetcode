package 字符串.t17;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2019/11/29 20:46
 */
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        Map<Character, String> map = new HashMap() {{
            put('0', "");
            put('1', "");
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "qprs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("");
        for (int i = 0; i < digits.length(); i++) {
            String string = map.get(digits.charAt(i));
            if (string.length() >= 3) {
                int size = queue.size();
                while (size-- != 0) {
                    String subStr = queue.poll();
                    for (int j = 0; j < string.length(); j++) {
                        queue.offer(subStr + string.charAt(j));
                    }
                }
            }
        }
        return queue;
    }

    public static void main(String[] args) {
        System.out.println(new LetterCombinations().letterCombinations("7"));
        System.out.println(new LetterCombinations().letterCombinations("23"));
        System.out.println(new LetterCombinations().letterCombinations("234"));
    }

}

package 栈.t1081;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/2/13 19:39
 */
public class SmallestSubsequence {
    public String smallestSubsequence(String text) {
        if (text.length() < 2) {
            return text;
        }
        int[] dic = new int[26];
        boolean[] used = new boolean[26];
        for (int i = 0; i < text.length(); i++) {
            dic[text.charAt(i) - 'a']++;
        }
        LinkedList<Character> stack = new LinkedList<>();
        stack.push(text.charAt(0));
        used[text.charAt(0)-'a'] = true;
        dic[text.charAt(0) - 'a']--;
        for (int i = 1; i < text.length(); i++) {
            int  c = text.charAt(i)-'a';
            int top = stack.peek() - 'a';
            if (c > top && !used[c]) {
                stack.push((char) (c + 'a'));
            } else if (c < top && !used[c]) {
                while (dic[top] > 0 && c < top) {
                    used[stack.pop()-'a'] = false;
                    if (stack.isEmpty()) {
                        break;
                    }
                    top = stack.peek()-'a';
                }
                stack.push((char) (c + 'a'));
            }
            dic[c]--;
            used[c] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        assert new SmallestSubsequence().smallestSubsequence("bdaccdbddc").equals("abdc");
        assert new SmallestSubsequence().smallestSubsequence("leetcode").equals("letcod");
        assert new SmallestSubsequence().smallestSubsequence("ecbacba").equals("eacb");
        assert new SmallestSubsequence().smallestSubsequence("cdadabcc").equals("adbc");
        assert new SmallestSubsequence().smallestSubsequence("abcd").equals("abcd");
    }
}

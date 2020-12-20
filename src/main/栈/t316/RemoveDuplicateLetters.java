package 栈.t316;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/2/13 19:47
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        char[] cs = s.toCharArray();
        for(int i=0;i<cs.length;i++){
            if(stack.contains(cs[i])){
                continue;
            }
            while(!stack.isEmpty() && stack.peek()>cs[i] && s.indexOf(stack.peek(),i) !=-1){
                stack.pop();
            }
            stack.push(cs[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=stack.size()-1;i>=0;i--){
            sb.append(stack.get(i));
        }
        return sb.toString();
    }
    public String removeDuplicateLetters1(String s) {
        if (s.length() < 2) {
            return s;
        }
        int[] dic = new int[26];
        boolean[] isPushed = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            dic[s.charAt(i) - 'a']++;
        }
        LinkedList<Character> stack = new LinkedList<>();
        stack.push(s.charAt(0));
        dic[s.charAt(0) - 'a']--;
        isPushed[s.charAt(0) - 'a'] = true;
        //cbacdcbc
        for (int i = 1; i < s.length(); i++) {
            char topChar = stack.peek();
            if (s.charAt(i) < topChar && !isPushed[s.charAt(i) - 'a']) {
                while (dic[topChar - 'a'] > 0 && s.charAt(i) <topChar) {
                    isPushed[stack.pop() - 'a'] = false;
                    if (stack.isEmpty()) {
                        break;
                    }
                    topChar = stack.peek();
                }
                stack.push(s.charAt(i));
            } else if (s.charAt(i) > topChar && !isPushed[s.charAt(i) - 'a']) {
                stack.push(s.charAt(i));
            }
            dic[s.charAt(i) - 'a']--;
            isPushed[s.charAt(i) - 'a'] = true;

        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.poll());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        assert new RemoveDuplicateLetters().removeDuplicateLetters("bcabc").equals("abc");
        assert new RemoveDuplicateLetters().removeDuplicateLetters("cbacdbc").equals("acdb");

    }
}

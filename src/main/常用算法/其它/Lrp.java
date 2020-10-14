package 常用算法.其它;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/09/26 14:54
 */
public class Lrp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            }else if(s.charAt(i) == ')'){
                if (stack.isEmpty()) {
                    System.out.println(0);
                    return;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println(1);
        }
    }
}
//lpr*(1+(5.39-4.8))#

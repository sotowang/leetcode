package 常用算法.其它;

import oracle.jrockit.jfr.events.Bits;
import 链表.ListNode;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    private static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode node = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
    public static void main(String[] args) {
        int[] nums = new int[100000000];
        System.out.println(new StringBuilder("asdjks").reverse());
    }
    public boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap();
        char[] c =  s.toCharArray();
        for(int i=0;i<c.length;i++){
            map.put(c[i],map.getOrDefault(c[i],0)+1);
        }
        int count = 0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if((entry.getValue() &1) == 1){
                count++;
            }
        }
        return count<=1;
    }

}

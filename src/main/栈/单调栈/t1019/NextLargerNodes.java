package 栈.单调栈.t1019;

import 链表.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/05/17 22:44
 */
public class NextLargerNodes {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = 0;
        ListNode cur = head;
        while(cur != null){
            size++;
            list.add(cur.val);
            cur = cur.next;
        }
        int[] res =  new int[size];
        LinkedList<Integer> stack = new LinkedList<>();
        for(int i=size-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=list.get(i)){
                stack.pop();
            }
            res[i] = stack.isEmpty()?0:stack.peek();
            stack.push(list.get(i));
        }
        return res;
    }
}

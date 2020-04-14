package 链表.t445;

import 链表.ListNode;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/2/18 17:48
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayDeque<Integer> stack1 = new ArrayDeque<>();
        ArrayDeque<Integer> stack2 = new ArrayDeque<>();
        while(l1!=null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode head = new ListNode(-1);
        while(!stack2.isEmpty() && !stack1.isEmpty()){
            int sum = stack1.pop() + stack2.pop()+carry;
            carry = sum/10;
            sum %=10;
            ListNode p = new ListNode(sum);
            p.next = head.next;
            head.next =p;
        }
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            int sum = 0;
            if(!stack1.isEmpty()){
                sum = stack1.pop()+carry;
            }else{
                sum = stack2.pop()+carry;
            }
            carry = sum/10;
            sum %=10;
            ListNode p = new ListNode(sum);
            p.next = head.next;
            head.next =p;
        }
        if(carry!=0){
            ListNode p = new ListNode(carry);
            p.next = head.next;
            head.next = p;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l5_1 = new ListNode(5);
        ListNode l5_2 = new ListNode(5);
        ListNode res1 = new AddTwoNumbers().addTwoNumbers(l5_1, l5_2);
        System.out.println("debug---");
        ListNode l7 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l5 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode res = new AddTwoNumbers().addTwoNumbers(l7, l5);
    }
}

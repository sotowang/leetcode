package 链表.t445;

import 链表.ListNode;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/2/18 17:48
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<ListNode> stack1 = new LinkedList<>();
        LinkedList<ListNode> stack2 = new LinkedList<>();
        ListNode p = l1;
        ListNode q = l2;
        while (p != null) {
            stack1.push(p);
            p = p.next;
        }
        while (q != null) {
            stack2.push(q);
            q = q.next;
        }
        ListNode head = new ListNode(-1);
        int carry = 0;
        int sum = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            ListNode node = null;
            if (!stack1.isEmpty() && !stack2.isEmpty()) {
                sum = stack1.poll().val + stack2.poll().val + carry;
            } else if (!stack1.isEmpty()) {
                sum = stack1.poll().val + carry;
            }else if (!stack2.isEmpty()) {
                sum = stack2.poll().val + carry;
            }
            carry = sum / 10;
            node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;
        }
        if (carry != 0) {
            ListNode node = new ListNode(carry);
            node.next = head.next;
            head.next = node;
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

package 链表.t143;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/19 21:09
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        while (head == null || head.next == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                fast = fast.next;
            }
        }
        fast = head;
        //此时slow指针指向节点即为后半部分首结点
        ListNode preSlow = new ListNode(-1);
        preSlow.next = null;
        ListNode q;
        while (slow != null) {
            q = slow.next;
            slow.next = preSlow.next;
            preSlow.next = slow;
            slow = q;
        }
        slow = preSlow.next;
        ListNode slow_next;
        //开始合并两个链表
        while (fast != null && slow != null) {
            slow_next = slow.next;
            slow.next = fast.next;
            fast.next = slow;
            slow = slow_next;
            fast = fast.next.next;
        }
        //防止最后尾部循环
        if (fast == null) {
            slow.next = null;
        }
        if (slow == null) {
            fast.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        new ReorderList().reorderList(l1);
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}

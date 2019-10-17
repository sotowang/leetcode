package 链表.t61;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/17 21:12
 */
public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        int index = k % len;
        //说明不需要移动
        if (index == 0) {
            return head;
        }
        p = head;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode q = head;
        while (index != 1) {
            p = p.next;
            index--;
        }
        while (p.next != null) {
            pre = pre.next;
            p = p.next;
            q = q.next;
        }
        p.next = head;
        pre.next = null;
        return q;
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
        ListNode res = new RotateRight().rotateRight(l1, 2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

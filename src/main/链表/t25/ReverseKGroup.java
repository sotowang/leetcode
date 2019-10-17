package 链表.t25;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/17 20:05
 */
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode firNode = head;
        ListNode kNode = head;
        for (int i = 1; i < k && kNode != null; i++) {
            kNode = kNode.next;
        }
        rollBack(head, kNode);
        if (kNode == null) {
            return head;
        }
        return head;
    }

    private ListNode rollBack(ListNode firHead, ListNode kNode) {
        ListNode pre = new ListNode(-1);
        pre.next = firHead;
        ListNode p = pre.next.next;
        pre.next.next = null;
        ListNode q;
        while (p != kNode) {
            q = p.next;
            p.next = pre.next;
            pre.next = p;
            p = q;
        }
        kNode.next = pre.next;
        pre.next = kNode;
        return pre.next;
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
        ListNode res = new ReverseKGroup().rollBack(l1, l4);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

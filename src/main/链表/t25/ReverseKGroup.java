package 链表.t25;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/17 20:05
 */
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode preHead = new ListNode(-1);
        ListNode dump = new ListNode(-1);

        dump.next = head;
        ListNode p = head;
        int len = 0;
        while (p != null) {
            p = p.next;
            len++;
        }
        p = head;
        for (int i = 1; i < k; i++) {
            p = p.next;
        }
        dump.next = p;
        p = head;
        ListNode q;
        int left = 0;
        ListNode temHead;
        while (left + k <= len) {
            temHead = p;
            for (int i = 0; i < k; i++) {
                q = p.next;
                p.next = preHead.next;
                preHead.next = p;
                p = q;
                left++;
            }
            preHead = temHead;

        }
        if (left < len) {
            preHead.next = p;
        }
        return dump.next;

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
        ListNode res = new ReverseKGroup().reverseKGroup(l1, 3);
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }
    }
}

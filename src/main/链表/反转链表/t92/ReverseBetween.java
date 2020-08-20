package 链表.反转链表.t92;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/18 21:43
 */
public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        }
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode top = preHead;
        for (int i = 0; i < m-1; i++) {
            top = top.next;
        }
        ListNode cur = top.next.next;
        ListNode q = cur.next ;
        ListNode end = top.next;
        for (int i = 0; i < n - m; i++) {
            q = cur.next;
            cur.next = top.next;
            top.next = cur;
            cur = q;
        }
        end.next = q;
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5= new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode res = new ReverseBetween().reverseBetween(l1, 2, 4);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

package 链表.t206;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/19 18:00
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode cur = head.next;
        head.next = null;
        ListNode q ;
        while (cur != null) {
            q = cur.next;
            cur.next = preHead.next;
            preHead.next = cur;
            cur = q;
        }
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

        ListNode res = new ReverseList().reverseList(l1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

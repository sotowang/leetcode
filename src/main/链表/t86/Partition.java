package 链表.t86;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/18 21:10
 */
public class Partition {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode p = small;
        ListNode q = big;
        while (cur != null) {
            if (cur.val < x) {
                p.next = cur;
                p = p.next;
            } else {
                q.next = cur;
                q = q.next;
            }
            cur = cur.next;
        }
        p.next = big.next;
        q.next = null;
        return small.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l21 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5= new ListNode(5);

        l1.next = l4;
        l4.next = l3;
        l3.next = l2;
        l2.next = l5;
        l5.next = l21;
        ListNode res = new Partition().partition(l1, 3);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

}

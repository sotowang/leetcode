package 链表.环形链表.t160;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/20 20:43
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null ) {
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (p != null) {
            lengthA++;
            p = p.next;
        }
        while (q != null) {
            lengthB++;
            q = q.next;
        }
        //将p指向较长链表
        int diff;
        if (lengthA > lengthB) {
            p = headA;
            q = headB;
            diff = lengthA - lengthB;
        } else {
            p = headB;
            q = headA;
            diff = lengthB - lengthA;
        }
        while (diff != 0 && p != null) {
            diff--;
            p = p.next;
        }
        while (p != null && q != null && p != q) {
            p = p.next;
            q = q.next;
        }
        if (p == q) {
            return p;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode l2 = new ListNode(2);
        ListNode l0 = new ListNode(0);
        ListNode l4 = new ListNode(4);
        ListNode l9 = new ListNode(9);
        ListNode l1 = new ListNode(1);
        ListNode l3 = new ListNode(3);
        l0.next = l9;
        l9.next = l1;
        l1.next = l2;
        l2.next = l4;
        l3.next = l2;

        ListNode res = new GetIntersectionNode().getIntersectionNode(l2, null);
        System.out.println(res.val);

    }
}

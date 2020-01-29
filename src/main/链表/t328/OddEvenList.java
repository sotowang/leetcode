package 链表.t328;

import 链表.ListNode;

/**
 * @auther: sotowang
 * @date: 2020/1/29 17:48
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(-1);
        ListNode evenHead = new ListNode(-1);
        ListNode oddCur = oddHead;
        ListNode evenCur = evenHead;
        oddCur.next = head;
        ListNode cur = head;
        ListNode curNext = null;
        while (cur != null) {
            curNext = cur.next;
            cur.next = oddCur.next;
            oddCur.next = cur;
            oddCur = oddCur.next;
            cur = curNext;
            if (cur != null) {
                curNext = cur.next;
                cur.next = evenCur.next;
                evenCur.next = cur;
                evenCur = evenCur.next;
                cur = curNext;
            } else {
                break;
            }
        }
        oddCur.next = evenHead.next;
        return oddHead.next;
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
        ListNode res = new OddEvenList().oddEvenList(l1);
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }

    }
}

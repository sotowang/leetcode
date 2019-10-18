package 链表.t83;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/18 20:55
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode p = pre;
        ListNode cur = head;
        while (cur != null) {
            while (cur != null && cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            p.next = cur;
            p = cur;
            cur = cur.next;
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l31 = new ListNode(3);

//        l1.next = l11;
//        l11.next = l2;

//        l1.next = l11;
//        l11.next = l2;
//        l2.next = l3;
//        l3.next = l31;

        ListNode res = new DeleteDuplicates().deleteDuplicates(l1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

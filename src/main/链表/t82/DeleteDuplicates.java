package 链表.t82;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/17 21:40
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(-1);
        ListNode cur = head;
        ListNode p = pre;
        while (cur != null) {
            while (cur != null && cur.next != null && cur.val == cur.next.val) {
                while (cur != null &&cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                if (cur != null) {
                    cur = cur.next;
                }
            }
            p.next = cur;
            if (cur != null) {
                p = cur;
                cur = cur.next;
            }

        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l1_1 = new ListNode(1);
        ListNode l1_2 = new ListNode(1);
        ListNode l1_3= new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l3_1 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l4_1 = new ListNode(4);
        ListNode l5 = new ListNode(5);

//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l3_1;
//        l3_1.next = l4;
//        l4.next = l4_1;
//        l4_1.next = l5;

//        l1_1.next = l1_2;
//        l1_2.next = l1_3;
//        l1_3.next = l2;
//        l2.next = l3;

        l1.next = l1_1;

//        ListNode res = new DeleteDuplicates().deleteDuplicates(l1);
        ListNode res = new DeleteDuplicates().deleteDuplicates(l1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

package 链表.t147;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/19 21:51
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode sorted = pre;
        ListNode unSorted = head.next;
        //指向已排序节点尾部
        ListNode rear = pre.next;
        ListNode q;
        while (unSorted != null) {
            q = unSorted.next;
            if (unSorted.val >= rear.val) {
                rear = rear.next;
                unSorted = unSorted.next;
            } else {
                while ( pre.next.val <= unSorted.val) {
                    pre = pre.next;
                }
                unSorted.next = pre.next;
                pre.next = unSorted;
                unSorted = q;
                pre = sorted;
            }
        }

    }
}

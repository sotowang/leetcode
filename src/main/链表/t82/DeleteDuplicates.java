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
    }
}

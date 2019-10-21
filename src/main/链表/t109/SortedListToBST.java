package 链表.t109;

import 链表.ListNode;



/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/21 21:29
 */
public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {

    }

    private ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null ) {
            if (fast.next == null || fast.next.next == null) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
    }

}

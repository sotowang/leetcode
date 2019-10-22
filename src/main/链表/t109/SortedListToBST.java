package 链表.t109;

import 链表.ListNode;



/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/21 21:29
 */
public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode preSlow = new ListNode(Integer.MIN_VALUE);
        preSlow.next = head;
        ListNode fast = head;
        ListNode slow = head;
        //找中间结点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            preSlow = preSlow.next;
            fast = fast.next.next;
        }
        //断开节点
        preSlow.next = null;
        //此时slow指向中间结点
        TreeNode root = new TreeNode(slow.val);

        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }

    public static void main(String[] args) {
        ListNode l_10 = new ListNode(-10);
        ListNode l_3 = new ListNode(-3);
        ListNode l0 = new ListNode(0);
        ListNode l5 = new ListNode(5);
        ListNode l9 = new ListNode(9);

        l_10.next = l_3;
        l_3.next = l0;
        l0.next = l5;
        l5.next = l9;

        TreeNode res = new SortedListToBST().sortedListToBST(l_10);

    }

}

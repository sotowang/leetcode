package 常用算法.链表排序;

import 链表.ListNode;

/**
 * @author: sotowang
 * @date: 2020/09/04 22:33
 */
public class MergeSort {
    public static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre= null;
        while (fast != null && fast.next != null) {
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        pre.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(slow);
        return merge(left, right);
    }

    public static ListNode merge(ListNode p, ListNode q) {
        ListNode dummyHead = new ListNode(-1);
        ListNode rear = dummyHead;
        ListNode next;
        while (p != null && q != null) {
            if (p.val < q.val) {
                next = p.next;
                p.next = rear.next;
                rear.next = p;
                p = next;
            } else {
                next = q.next;
                q.next = rear.next;
                rear.next = q;
                q = next;
            }
            rear = rear.next;
        }
        if (p != null) {
            rear.next = p;
        }
        if (q != null) {
            rear.next = q;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(4);
        ListNode l2 = new ListNode(3);
        ListNode l1 = new ListNode(2);
        ListNode l4 = new ListNode(1);
        l3.next = l2;
        l2.next = l1;
        l1.next = l4;
        ListNode head = mergeSort(l3);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

package 常用算法.链表排序;

import 链表.ListNode;

/**
 * @author: sotowang
 * @date: 2020/09/04 20:58
 */
public class QuickSort {

    public static ListNode quickSort(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode bigHead = new ListNode(-1);
        ListNode smallHead = new ListNode(-1);
        ListNode cur = head.next;
        int val = head.val;
        while (cur != null) {
            ListNode next = cur.next;
            if (cur.val > val) {
                cur.next = bigHead.next;
                bigHead.next = cur;
            } else {
                cur.next = smallHead.next;
                smallHead.next = cur;
            }
            cur = next;
        }
        ListNode left = quickSort(smallHead.next);
        ListNode right = quickSort(bigHead.next);
        ListNode rear = left;
        if (left == null) {
            head.next = right;
            return head;
        }
        while (rear.next != null) {
            rear = rear.next;
        }
        rear.next = head;
        head.next = right;
        return left;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(4);
        ListNode l2 = new ListNode(3);
        ListNode l1 = new ListNode(2);
        ListNode l4 = new ListNode(1);
        l3.next = l2;
        l2.next = l1;
        l1.next = l4;
        ListNode head = quickSort(l3);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

package 常用算法.链表排序;

import 链表.ListNode;

/**
 * @author: sotowang
 * @date: 2020/09/04 20:58
 */
public class QuickSort {
    public static void quickSort(ListNode head,ListNode end) {
        if (head == null ||  head == end) {
            return;
        }
       ListNode first = head;
        ListNode second = head.next;

        int piv = head.val;
        while (second != end.next && second != null) {
            if (second.val < piv) {
                first = first.next;
                if (first != second) {
                    int tem = first.val;
                    first.val = second.val;
                    second.val = tem;
                }
            }
            second = second.next;
        }

        if (head != first) {
            int tem = head.val;
            head.val = first.val;
            first.val = tem;
        }
        quickSort(head, first);
        quickSort(first.next, end);
    }


    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l1 = new ListNode(1);
        ListNode l4 = new ListNode(4);
        l3.next = l2;
        l2.next = l1;
        l1.next = l4;
        //3--2--1--4
        ListNode p = l3;
        while (p.next != null) {
            p = p.next;
        }
        quickSort(l3, p);
        while (l3 != null) {
            System.out.print(l3.val + " ");
            l3 = l3.next;
        }
    }
}

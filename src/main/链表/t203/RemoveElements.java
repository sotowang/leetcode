package 链表.t203;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/20 21:16
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode pre = new ListNode(Integer.MIN_VALUE);
        pre.next = head;
        head = pre;
        while (pre != null && pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            }else{
                pre = pre.next;
            }

        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l61 = new ListNode(6);
//        l1.next = l2;
//        l2.next = l6;
//        l6.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        l5.next = l61;
        l1.next = l11;
        ListNode res = new RemoveElements().removeElements(l1, 1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

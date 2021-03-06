package 链表.t24;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/16 21:19
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode curNode = preHead;
        while (curNode.next != null) {
            if (curNode.next.next == null) {
                break;
            }
            ListNode temp = curNode.next;
            curNode.next = curNode.next.next;
            temp.next = curNode.next.next;
            curNode.next.next = temp;
            curNode = curNode.next.next;
        }

        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
//        l3.next = l4;

        ListNode res = new SwapPairs().swapPairs(l1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

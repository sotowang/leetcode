package 链表.t142;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/19 20:55
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            //快慢指针相遇,说明有环
            if (fast == slow) {
                //重置fast为首结点
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l0 = new ListNode(0);
        ListNode l_4 = new ListNode(-4);

        l3.next = l2;
        l2.next = l0;
        l0.next = l_4;
        l_4.next = l2;

        ListNode res = new DetectCycle().detectCycle(l3);
        System.out.println(res.val);

    }
}

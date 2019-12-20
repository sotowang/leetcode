package 链表.t25;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/17 20:05
 */
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode pre = new ListNode(-1);
        ListNode dumy = new ListNode(-1);
        //翻转链表前驱
        pre.next = head;
        dumy = pre;
        //翻转链表末尾
        ListNode end = pre;
        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode endNext = end.next;
            //翻转 start-->end
            ListNode start = pre.next;
            end.next = null;
            pre.next = reverse(start);

            //更新位置
            start.next = endNext;
            pre = end = start;
        }
        return dumy.next;

    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode res = new ReverseKGroup().reverseKGroup(l1, 3);
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }
    }
}

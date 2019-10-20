package 链表.t148;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/20 11:44
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        preHead.next = head;
        //链表长度
        int length = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            length++;
        }
        ListNode left ;
        ListNode right;
        for (int i = 1; i < length; i <<= 1) {
            ListNode cur = preHead.next;
            ListNode rear = preHead;
            while (cur != null) {
                right = cut(cur, i);
                left = cur;
                cur = cut(right, i);
                rear.next = merge(left, right);

                //尾部移到最后
                while (rear.next != null) {
                    rear = rear.next;
                }
            }
        }
        return preHead.next;
    }

    /**
     * 剪切链表,返回右端链表首节点
     *
     * @param head
     * @param n
     * @return
     */
    private ListNode cut(ListNode head, int n) {
        if (n == 0 || head == null) {
            return null;
        }
        ListNode p = head;
        while (n != 1 && p != null) {
            n--;
            p = p.next;
        }
        if (p == null) {
            return null;
        }
        ListNode next = p.next;
        p.next = null;
        return next;
    }

    /**
     * 合并两个有序链表
     * @param left
     * @param right
     * @return
     */
    private ListNode merge(ListNode left, ListNode right) {
        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        ListNode rear = preHead;
        ListNode q_right;
        while (left != null && right != null) {
            if (left.val > right.val) {
                q_right = right.next;
                right.next = rear.next;
                rear.next = right;
                right = q_right;
            } else {
                q_right = left.next;
                left.next = rear.next;
                rear.next = left;
                left = q_right;
            }
            rear = rear.next;
        }
        if (left == null) {
            rear.next = right;
        }
        if (right == null) {
            rear.next = left;
        }
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l6 = new ListNode(6);
        ListNode l1 = new ListNode(1);
        ListNode l5 = new ListNode(5);
        ListNode l7 = new ListNode(7);
        ListNode l_1 = new ListNode(-1);
        ListNode l0 = new ListNode(0);
//        l4.next = l3;
//        l3.next = l2;
//        l2.next = l6;
//        l6.next = l5;
//        l5.next = l7;
//        l7.next = l1;
        l_1.next = l5;
        l5.next = l3;
        l3.next = l4;
        l4.next = l0;
        ListNode res = new SortList().sortList(l_1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

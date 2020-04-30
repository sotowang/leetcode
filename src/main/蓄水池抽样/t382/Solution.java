package 蓄水池抽样.t382;

import 链表.ListNode;

import java.util.Random;

public class Solution {
    private ListNode head;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int res = head.val;
        ListNode index = head.next;
        Random random = new Random();
        int i = 2;
        while (index != null) {
            if (random.nextInt(i) == 0) {
                res = index.val;
            }
            i++;
            index = index.next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        System.out.println(new Solution(l1).getRandom());
    }
}

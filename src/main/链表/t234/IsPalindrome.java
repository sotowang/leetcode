package 链表.t234;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/20 21:33
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        //快慢指针找中点
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next == null || fast.next.next == null) {
                break;
            }
            fast = fast.next.next;
        }
        //后半部分链表反转
        //此时链表长度为奇数,slow指向中间结点
        ListNode revList = slow;
        if (fast.next == null) {
             revList= reverse(slow);
        } else if (fast.next.next == null) {//此时链表长度为偶数,slow指向右半部分首结点
             revList = reverse(slow);
        }
        //判断两链表是否相等
        ListNode cur = head;
        while (revList != null && revList.val == cur.val) {
            revList = revList.next;
            cur = cur.next;
        }
        if (revList == null) {
            return true;
        } else {
            return false;
        }
    }

    private ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        ListNode cur = head;
        ListNode q;
        while (cur != null) {
            q = cur.next;
            cur.next = preHead.next;
            preHead.next = cur;
            cur = q;
        }
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l21 = new ListNode(2);
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(1);
        l1.next = l2;
//        l2.next = l21;
//        l21.next = l11;

        l2.next = l11;

//        l2.next = l21;
        System.out.println(new IsPalindrome().isPalindrome(l1));

    }
}

package 双指针.t876;

import 链表.ListNode;

/**
 * @auther: sotowang
 * @date: 2020/4/7 15:10
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null){
            if(fast.next == null){
                return slow;
            }
            if(fast.next.next == null){
                return slow.next;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

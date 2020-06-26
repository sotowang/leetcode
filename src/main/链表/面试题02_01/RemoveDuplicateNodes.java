package 链表.面试题02_01;

import 链表.ListNode;

import java.util.HashSet;

/**
 * @auther: sotowang
 * @date: 2020/06/26 20:55
 */
public class RemoveDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        HashSet<Integer> set = new HashSet<>();
        ListNode preHead = head;
        ListNode cur = head.next;
        set.add(head.val);
        while(cur != null){
            if(!set.add(cur.val)){
                cur = cur.next;
                preHead.next = cur;
            }else{
                preHead = preHead.next;
                cur = cur.next;
            }
        }
        return head;
    }
}

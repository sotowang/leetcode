package 链表.t237;

import 链表.ListNode;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/21 21:22
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

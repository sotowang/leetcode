package 堆.t23;

import 链表.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/16 20:39
 */
public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        int len = lists.length;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(len, Comparator.comparingInt(a -> a.val));
        ListNode mergeListNode = new ListNode(0);
        ListNode curNode = mergeListNode;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null){
                continue;
            }
            priorityQueue.add(lists[i]);
        }
        while (!priorityQueue.isEmpty()) {
            ListNode minListNode = priorityQueue.poll();
            if (minListNode.next != null) {
                priorityQueue.add(minListNode.next);
            }
            curNode.next = minListNode;
            curNode = curNode.next;
        }
        return mergeListNode.next;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode result = new MergeKLists().mergeKLists(new ListNode[]{l1, l2, l3});
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}

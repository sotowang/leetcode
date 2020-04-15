package 链表.t19;


/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/15 21:46
 */
public class RemoveNthFormEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        while(n-->0){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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

        ListNode l6 = new ListNode(1);
//        ListNode res = new RemoveNthFormEnd().removeNthFromEnd(l1, 2);
        ListNode res = new RemoveNthFormEnd().removeNthFromEnd(l6, 1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }


     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

}

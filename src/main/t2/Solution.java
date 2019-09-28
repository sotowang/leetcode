package t2;

/**
 * @author wst
 * @create 2019-09-09 15:40
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //进位标志
        int flag = 0;
        ListNode res = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = res;

        while (p != null || q != null) {
            int val1 = (p == null ? 0 : p.val);
            int val2 = (q == null ? 0 : q.val);

            int sum = val1 + val2 + flag;
            flag = sum / 10;
            res.next = new ListNode(sum % 10);
            res = res.next;

            p = p == null ? p : p.next;
            q = q == null ? q : q.next;

        }
        if (flag > 0) {
            res.next = new ListNode(1);
        }
        return head.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(5);
//        ListNode v2 = new ListNode(8);
//        ListNode v3 = new ListNode(3);
//        l1.next = v2;
//        v2.next = v3;

        ListNode l2 = new ListNode(5);
//        ListNode v4 = new ListNode(6);
//        ListNode v5 = new ListNode(4);

//        l2.next = v4;
//        v4.next = v5;

        ListNode res = solution.addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;

        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


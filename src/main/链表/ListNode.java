package 链表;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/16 20:40
 */
public  class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }
}

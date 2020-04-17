package 广度优先搜索.面试题04_03;

import 广度优先搜索.TreeNode;
import 链表.ListNode;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @auther: sotowang
 * @date: 2020/4/17 15:20
 */
public class ListOfDepth {
    public ListNode[] listOfDepth(TreeNode tree) {
        if(tree == null){
            return new ListNode[]{};
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(tree);
        ArrayList<ListNode> res = new ArrayList();
        while(!queue.isEmpty()){
            int size  = queue.size();
            ListNode head = new ListNode(-1);
            ListNode rear = head;
            for(int i=0;i<size;i++){
                TreeNode cur = queue.poll();
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!= null){
                    queue.offer(cur.right);
                }
                ListNode p = new ListNode(cur.val);
                p.next = rear.next;
                rear.next = p;
                rear = p;
            }
            res.add(head.next);
        }
        return res.toArray(new ListNode[0]);
    }
}

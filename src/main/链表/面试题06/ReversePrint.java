package 链表.面试题06;

import 链表.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/4/13 21:10
 */
public class ReversePrint {
    List<Integer> list = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        print(head,list);
        int size = list.size();
        int[] res = new int[size];
        for(int i=0;i<size;i++){
            res[i] = list.get(i);
        }
        return res;
    }
    private void  print(ListNode head,List list){
        if(head == null){
            return;
        }
        print(head.next,list);
        list.add(head.val);
    }
}

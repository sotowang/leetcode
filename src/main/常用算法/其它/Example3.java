package 常用算法.其它;

import oracle.jrockit.jfr.events.Bits;
import 链表.ListNode;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k>arr.length){
            return new int[]{};
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (b-a));
        for(int i=0;i<arr.length;i++){
            if(maxHeap.size()<k){
                maxHeap.offer(arr[i]);
            }else{
                if(maxHeap.peek()>arr[i]){
                    maxHeap.poll();
                    maxHeap.offer(arr[i]);
                }
            }
        }
        int[] nums = new int[k];
        int index = 0;
        while(!maxHeap.isEmpty()){
            nums[index++] = maxHeap.poll();
        }
        return nums;
    }
    public static void main(String[] args) {
        String res = "ababab".replace("abab", "");
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(res);

    }
    public boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap();
        char[] c =  s.toCharArray();
        for(int i=0;i<c.length;i++){
            map.put(c[i],map.getOrDefault(c[i],0)+1);
        }
        int count = 0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if((entry.getValue() &1) == 1){
                count++;
            }
        }
        return count<=1;
    }

}

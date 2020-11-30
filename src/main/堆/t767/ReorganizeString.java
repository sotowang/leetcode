package 堆.t767;

import java.util.PriorityQueue;

/**
 * @author: sotowang
 * @date: 2020/11/30 22:35
 */
public class ReorganizeString {
    public String reorganizeString(String S) {
        int[] charArray =  new int[26];
        char[] cs = S.toCharArray();
        for(char c:cs){
            charArray[c-'a']++;
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<Character>((a,b)->(charArray[b-'a']-charArray[a-'a']));
        for(int i=0;i<26;i++){
            if(charArray[i]>0){
                maxHeap.offer((char)(i+'a'));
            }
        }
        if(charArray[maxHeap.peek()-'a']>(S.length()+1)/2){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while(maxHeap.size()>1){
            char c1 = maxHeap.poll();
            char c2 = maxHeap.poll();
            sb.append(c1);
            sb.append(c2);
            if(--charArray[c1-'a']>0){
                maxHeap.offer(c1);
            }
            if(--charArray[c2-'a']>0){
                maxHeap.offer(c2);
            }
        }
        if(!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            if(charArray[c-'a']>1){
                return "";
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReorganizeString().reorganizeString("aab"));
    }
}

package 滑动窗口.面试题17_18;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/24 15:53
 */
public class ShortestSeq {
    public int[] shortestSeq(int[] big, int[] small) {
        int left = 0;
        int right = 0;
        int match = 0;
        Set<Integer> smallSet = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<small.length;i++){
            smallSet.add(small[i]);
        }
        int[] res = {-1,big.length};
        while(right<big.length){
            if(smallSet.contains(big[right])){
                int val = map.getOrDefault(big[right],0);
                if(val == 0){
                    match++;
                }
                map.put(big[right],val+1);
            }
            while(match == small.length){
                if(right -left < res[1]-res[0] ||(right -left == res[1]-res[0] && left<res[0]) ){
                    res[0] = left;
                    res[1] = right;
                }
                int val = map.getOrDefault(big[left],0);
                if(val==1){
                    match--;
                }
                map.put(big[left],val-1);
                left++;
            }
            right++;
        }
        if(res[0] == -1){
            return new int[]{};
        }else{
            return res;
        }
    }

    public static void main(String[] args) {
        //[878982, 143504, 268583, 394343, 849567, 257687, 352256, 35131, 663529, 543027]
        //[143504]
        int[] big2 = new int[]{878982, 143504, 268583, 394343, 849567, 257687, 352256, 35131, 663529, 543027};
        int[] small2 = new int[]{143504};
        int[] res2 = new ShortestSeq().shortestSeq(big2, small2);
        Arrays.stream(res2).forEach(System.out::print);
        System.out.println();

        int[] big1 = new int[]{1, 2, 3};
        int[] small1 = new int[]{1, 2, 3};
        int[] res1 = new ShortestSeq().shortestSeq(big1, small1);

        Arrays.stream(res1).forEach(System.out::print);

        System.out.println();
        int[] big = new int[]{7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8, 8, 9, 7};
        int[] small = new int[]{1, 5, 9};
        int[] res = new ShortestSeq().shortestSeq(big, small);
        Arrays.stream(res).forEach(System.out::println);
    }
}

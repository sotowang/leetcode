package 堆.t1046;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @auther: sotowang
 * @date: 2020/07/12 16:00
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        if(stones.length == 2){
            return Math.abs(stones[0]-stones[1]);
        }
        Arrays.sort(stones);
        if(stones[stones.length-3] == 0){
            return stones[stones.length-1] - stones[stones.length -2];
        }
        stones[stones.length-1] = stones[stones.length-1] - stones[stones.length-2];
        stones[stones.length-2] = 0;
        return lastStoneWeight(stones);
    }
    public int lastStoneWeight1(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b)->(b-a));
        for(int stone:stones){
            queue.offer(stone);
        }
        while(queue.size()>1){
            int one = queue.poll();
            int two = queue.poll();
            int dif = one -two;
            if(dif>0){
                queue.offer(dif);
            }
        }
        return queue.isEmpty()?0:queue.peek();
    }
}

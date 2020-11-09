package 堆.t973;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author: sotowang
 * @date: 2020/11/09 19:53
 */
public class KClosest {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->((b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1])));
        for(int i=0;i<K;i++){
            maxHeap.offer(points[i]);
        }
        for(int i=K;i<points.length;i++){
            int tem = points[i][0] * points[i][0] + points[i][1]*points[i][1];
            int[] peek = maxHeap.peek();
            if(tem < peek[0]*peek[0] + peek[1] * peek[1]){
                maxHeap.poll();
                maxHeap.offer(points[i]);
            }
        }
        int[][] res = new int[K][];
        int index = 0;
        Iterator<int[]> it = maxHeap.iterator();
        while(it.hasNext()){
            res[index++] = it.next();
        }
        return res;

    }

    public static void main(String[] args) {
        int[][] arr = {{-5, 4}, {-6, -5}, {4, 6}};
        int[][] res = new KClosest().kClosest(arr, 2);
        Arrays.stream(res).forEach(a->System.out.println(a[0] +"," +  a[1]));

    }
}

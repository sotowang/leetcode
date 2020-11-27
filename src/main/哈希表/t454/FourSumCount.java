package 哈希表.t454;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sotowang
 * @date: 2020/11/27 18:33
 */
public class FourSumCount {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                int sum = A[i] + B[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                int sum = C[i] + D[j];
                if(map.containsKey(-sum)){
                    count += map.get(-sum);
                }
            }
        }
        return count;
    }
}

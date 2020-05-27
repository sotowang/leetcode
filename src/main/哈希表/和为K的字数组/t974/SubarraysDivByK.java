package 哈希表.和为K的字数组.t974;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wangsongtao
 * @date: 2020/05/27 21:08
 */
public class SubarraysDivByK {
    public int subarraysDivByK(int[] A, int K) {
        int count = 0;
        int sum =0 ;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<A.length;i++){
            sum += A[i];
            int tem = (sum %K+K)% K; //防止余数为负
            if(map.containsKey(tem)){
                int val = map.get(tem);
                count += val;
                map.put(tem,val+1);
            }else{
                map.put(tem,1);
            }
            // count += map.getOrDefault(tem,0);
            // map.put(tem,map.getOrDefault(tem,0)+1);
        }

        return count;
    }
}

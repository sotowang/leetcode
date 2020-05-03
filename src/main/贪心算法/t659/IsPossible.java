package 贪心算法.t659;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/05/03 17:10
 */
public class IsPossible {
    public boolean isPossible(int[] nums) {
        if(nums.length<3){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> endMap = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:nums){
            if(map.get(n)==0){
                continue;
            }
            map.put(n,map.get(n)-1);
            if(endMap.getOrDefault(n-1,0)>0){
                endMap.put(n,endMap.getOrDefault(n,0)+1);
                endMap.put(n-1,endMap.get(n-1)-1);
            }else if(map.getOrDefault(n+1,0)>0 && map.getOrDefault(n+2,0)>0){
                map.put(n+1,map.get(n+1)-1);
                map.put(n+2,map.get(n+2)-1);
                endMap.put(n+2,endMap.getOrDefault(n+2,0)+1);
            }else{
                System.out.print(n + ","+endMap.getOrDefault(n-1,0));
                return false;
            }

        }
        return true;

    }
}

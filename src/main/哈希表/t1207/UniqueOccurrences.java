package 哈希表.t1207;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @auther: sotowang
 * @date: 2020/4/26 15:57
 */
public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return map.size() == new HashSet<Integer>(map.values()).size();
    }
}

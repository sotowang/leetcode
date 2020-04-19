package 哈希表.t1296;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/4/19 18:59
 */
public class IsPossibleDivide {
    public boolean isPossibleDivide(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) != 0){
                for(int j=0;j<k;j++){
                    int tem = map.getOrDefault(nums[i]+j,0);
                    if(tem == 0){
                        return false;
                    }else{
                        map.put(nums[i]+j,--tem);
                        count++;
                    }
                }
            }
        }
        return count==nums.length;
    }
}

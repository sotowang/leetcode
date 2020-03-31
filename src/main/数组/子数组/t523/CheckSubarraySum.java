package 数组.子数组.t523;

import java.util.HashMap;

/**
 * @auther: sotowang
 * @date: 2020/3/31 19:12
 */
public class CheckSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2){
            return false;
        }else if(k<0){
            k = -k;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == 0 && nums[i+1] == 0){
                return true;
            }
        }
        if( k == 0){
            return false;
        }else if(k<0){
            k = -k;
        }
        HashMap<Integer,Integer> map = new HashMap();
        map.put(0,-1);
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int mod = sum %k;
            if(map.containsKey(mod) ){
                if( i-map.get(mod)>1){
                    return true;
                }
            }else{
                map.put(mod,i);
            }
        }
        return false;
    }
}

package 数组.摩尔投票求众数.面试题17_10;

/**
 * @auther: sotowang
 * @date: 2020/4/21 21:17
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int me = nums[0];
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == me){
                count++;
            }else{
                count--;
                if(count ==0){
                    count ++;
                    me = nums[i];
                }
            }
        }
        count = 0;
        for(int i=0;i<nums.length;i++){
            if(me == nums[i]){
                count++;
            }
        }
        return count>(nums.length>>1)?me:-1;
    }
}

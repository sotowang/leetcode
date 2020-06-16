package 数组.t665;

/**
 * @auther: sotowang
 * @date: 2020/06/13 16:54
 */
public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        if(nums.length <3){
            return true;
        }
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
                if(count>1){
                    return false;
                }
                if(i==0 || nums[i-1]<nums[i+1]){
                    nums[i] = nums[i+1];
                }else{
                    nums[i+1] = nums[i];
                }
            }
        }
        return true;
    }
}

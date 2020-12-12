package 贪心算法.t376;

/**
 * @author: sotowang
 * @date: 2020/12/12 15:11
 */
public class WiggleMaxLength {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if(len <2){
            return len;
        }
        int up = 1;
        int down = 1;
        for(int i=1;i< len;i++){
            if(nums[i] > nums[i-1]){
                up = down+1;
            }else if(nums[i]<nums[i-1]){
                down = up+1;
            }
        }
        return Math.max(up,down);
    }
}

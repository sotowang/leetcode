package 贪心算法.t738;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/4/14 16:26
 */
public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        if(N<10){
            return N;
        }
        char[] nums = String.valueOf(N).toCharArray();
        int len = nums.length;
        int index = -1;
        for(int i=len-1;i>0;i--){
            if(nums[i]<nums[i-1]){
                index = i;
                nums[i-1]--;

            }
        }
        if(index!=-1){
            Arrays.fill(nums,index,len,'9');
        }
        return Integer.parseInt(String.valueOf(nums));
    }
}

package 蓄水池抽样.t398;

import java.util.Random;

/**
 * @auther: sotowang
 * @date: 2020/4/30 21:57
 */
public class Solution {
    private int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        int index = -1;
        int size = 0;
        Random random = new Random();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                size++;
                if(random.nextInt(size) == 0){
                    index = i;
                }
            }
        }
        return index;
    }
}

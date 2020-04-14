package 栈.t456;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/4/14 15:55
 */
public class Find132pattern {
    public boolean find132pattern(int[] nums) {
        if(nums.length <3){
            return false;
        }
        int len = nums.length;
        int min = Integer.MIN_VALUE;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=len-1;i>=0;i--){
            if(nums[i]<min){
                return true;
            }
            while(!stack.isEmpty() && nums[i]>stack.peek()){
                int tem = stack.pop();
                min = tem>min?tem:min;
            }
            stack.push(nums[i]);
        }
        return false;
    }
}

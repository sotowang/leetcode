package 栈.单调栈.t315;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: wangsongtao
 * @date: 2020/07/18 23:39
 */
public class CountSmaller {
    public List<Integer> countSmaller(int[] nums) {
        LinkedList<Integer> resList = new LinkedList<>();
        if(nums == null || nums.length == 0){
            return resList;
        }
        LinkedList<Integer> minStack = new LinkedList<>();
        minStack.push(nums.length-1);
        resList.offerFirst(0);
        for(int i=nums.length-1;i>=0;i--){
            int count = 0;
            while(!minStack.isEmpty() && nums[minStack.peek()]<nums[i]){
                minStack.pop();
                count++;
            }
            minStack.push(i);
            resList.offerFirst(count);
        }
        return resList;
    }
}

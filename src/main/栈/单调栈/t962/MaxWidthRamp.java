package 栈.单调栈.t962;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/05/02 23:16
 */
public class MaxWidthRamp {
    public int maxWidthRamp(int[] A) {
        LinkedList<Integer> stack = new LinkedList<>();
        for(int i=0;i<A.length;i++){
            if(stack.isEmpty() || A[stack.peek()]>A[i]){
                stack.push(i);
            }
        }
        int max = 0;
        for(int i= A.length-1;i>=0;i--){
            while(!stack.isEmpty() && A[i]>=A[stack.peek()]){
                max = Math.max(i-stack.pop(),max);
            }
        }
        return max;
    }
}

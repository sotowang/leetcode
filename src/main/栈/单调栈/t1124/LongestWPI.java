package 栈.单调栈.t1124;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/05/03 16:28
 */
public class LongestWPI {
    public int longestWPI(int[] hours) {
        int[] dp = new int[hours.length+1];
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(0);
        for(int i=1;i<=hours.length;i++){
            dp[i] = hours[i-1]>8?dp[i-1]+1:dp[i-1]-1;
            if(dp[i]<dp[stack.peek()]){
                stack.push(i);
            }
        }
        int max = 0;
        for(int i=hours.length;i>=0;i--){
            while(!stack.isEmpty() && dp[i]-dp[stack.peek()]>0){
                max = Math.max(max,i-stack.pop());
            }
        }
        return max;
    }
}

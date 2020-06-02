package 动态规划.接雨水.面试题17_21;

/**
 * @author: wangsongtao
 * @date: 2020/06/02 21:27
 */
public class Trap {
    public int trap(int[] height) {
        if(height == null || height.length <= 1){
            return 0;
        }
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int left = 0;
        int right = 0;
        for(int i=1;i<height.length;i++){
            if(height[i-1]>left){
                leftMax[i] =height[i-1];
                left = height[i-1];
            }else{
                leftMax[i] = left;
            }
            if(height[height.length-i]>right){
                rightMax[height.length-i-1] = height[height.length-i];
                right = height[height.length-i];
            }else{
                rightMax[height.length-i-1] = right;
            }
            //System.out.print(rightMax[i] + ",");
        }
        int sum = 0;
        for(int i=0;i<height.length;i++){
            sum += Math.max(Math.min(leftMax[i],rightMax[i])-height[i],0);
        }
        return sum;
    }
}

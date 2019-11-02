package 动态规划.t42;

/**
 * @auther: sotowang
 * @date: 2019/10/29 22:12
 */
public class Trap {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        //保存第i个位置处,左/右边最大的柱子
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        //查找左边最大的柱子
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(height[i - 1], maxLeft[i - 1]);
        }
        //查找右边最大的柱子
        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i + 1], maxRight[i + 1]);
        }
        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            //若max柱子比i柱子还小,此时i处是不可能盛水的
            int min = Math.min(maxLeft[i], maxRight[i]);
            if (min > height[i]) {
                sum += (min - height[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(new Trap().trap(nums));

    }
}

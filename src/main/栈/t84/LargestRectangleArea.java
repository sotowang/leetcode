package 栈.t84;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/12/31 16:44
 */
public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        //单调栈
        LinkedList<Integer> stack = new LinkedList();
        int max = heights[0];
        //stack存放数组的下标
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()] ) {
                //要弹出的元素
                int popIndex = stack.pop();
                //栈顶元素
                int topIndex = stack.peek() == null ? -1: stack.peek();
                int area = heights[popIndex] * (i - topIndex - 1);
                max = Math.max(area, max);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int popIndex = stack.pop();
            int topIndex = stack.peek() == null ? -1 : stack.peek();
            max = Math.max(heights[popIndex] * (heights.length - topIndex - 1), max);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights3 = {5, 4, 1, 2};
        assert new LargestRectangleArea().largestRectangleArea(heights3) == 8;
        int[] heights2 = {2, 1, 2};
        assert new LargestRectangleArea().largestRectangleArea(heights2) == 3;
        int[] heights1 = {1, 2, 3, 4, 5, 6};
        assert new LargestRectangleArea().largestRectangleArea(heights1) == 12;
        int[] heights = {2, 1, 5, 6, 2, 3};
        assert new LargestRectangleArea().largestRectangleArea(heights) == 10;
    }
}

package 常用算法.其它;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @auther: sotowang
 * @date: 2020/3/29 19:40
 */
public class Example5 {
    private int minSum = Integer.MAX_VALUE;
    public int[] WaitInLine1 (int[] a, int[] b) {
        // write code here
        int len = a.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = i + 1;
        }
        Stack<Integer> path = new Stack();
        boolean[] visited = new boolean[nums.length];
        ArrayList<Integer> res = new ArrayList<>();
        getPermutation(nums, path, 0, visited, a, b, res);
        for (int i = 0; i < len; i++) {
            nums[i] = res.get(i);
        }
        return nums;
    }

    private void getPermutation(int[] nums, Stack<Integer> path, int count, boolean[] visited, int[] a, int[] b, ArrayList<Integer> res) {
        if (count == nums.length) {
            int sum = calculate(path, a, b);
            if (sum < minSum) {
                minSum = sum;
                res.clear();
                for (int n :
                        path) {

                    res.add(n);
                }
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                path.push(nums[i]);
                visited[i] = true;
                getPermutation(nums, path, count + 1, visited, a, b, res);
                path.pop();
                visited[i] = false;
            }
        }
    }

    private int calculate( Stack<Integer> res, int[] a, int[] b) {
        int sum = 0;
        int len = res.size();
        for (int i = 0; i < len; i++) {
            int index = res.get(i);
            sum += a[index-1] * i + b[index-1] * (len - 1 - i);
        }
        return sum;
    }
    public int[] WaitInLine (int[] a, int[] b) {
        // write code here
        int len = a.length;
        PriorityQueue<Integer> heap = new PriorityQueue<>(len, (c, d) -> (b[d - 1] - a[d - 1]) - (b[c - 1] - a[c - 1]));

        for (int i = 0; i < len; i++) {
            heap.offer(i+1);
        }
        int[] res = new int[len];
        int index = len-1;
        while (!heap.isEmpty()) {
            res[index--] = heap.poll();
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] a = new int[]{8, 9, 7, 4, 3, 2, 23, 4, 5, 5, 4, 4, 2, 34, 43, 4, 3, 23, 32, 3, 23, 3, 223, 32, 23, 4, 3, 32, 2, 2, 1};
//        int[] b = new int[]{5, 8, 3, 9, 7, 4, 3, 2, 23, 4, 5, 5, 4, 4, 2, 34, 43, 4, 3, 23, 32, 3, 2, 4, 3, 23, 32, 3, 23, 3, 3};
        int[] a = {8,9,7};
        int[] b = {5, 8, 3};
        int[] res = new Example5().WaitInLine(a, b);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}

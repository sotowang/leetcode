package 字节跳动.array.t60;

import java.util.ArrayList;

public class GetPermutation {
    StringBuilder result = new StringBuilder();

    public String getPermutation(int n, int k) {
        boolean[] visited = new boolean[n];
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        return findPermutation(nums, new ArrayList<String>(), 0, k, visited);
    }

    private String findPermutation(int[] nums, ArrayList<String> path, int count, int k, boolean[] visited) {
        if (count == nums.length) {
            for (String s :
                    path) {
                result.append(s);
            }
            return result.toString();
        }
        for (int i = 0; i < nums.length; i++) {
            int fac = factorial(nums.length - 1 - count);
            if (visited[i]) {
                continue;
            }
            if (fac < k) {
                k  -= fac;
                continue;
            }
            path.add(String.valueOf(nums[i]));
            visited[i] = true;
            return findPermutation(nums, path, count + 1, k , visited);
        }
        return result.toString();
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new GetPermutation().getPermutation(3, 2));
        System.out.println(new GetPermutation().getPermutation(3,4));
        System.out.println(new GetPermutation().getPermutation(4,9));

    }
}

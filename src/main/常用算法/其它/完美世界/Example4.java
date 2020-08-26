package 常用算法.其它.完美世界;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/20 9:21
 */
public class Example4 {

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        findPermuteUnique(nums, 0, new Stack<Integer>(),result,visited);
        return result;
    }

    private static void findPermuteUnique(int[] nums, int count, Stack<Integer> path, List<List<Integer>> result, boolean[] visited) {
        if (nums.length == count) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1] && !visited[i-1]) {
                continue;
            }

            if (!visited[i]) {
                path.push(nums[i]);
                visited[i] = true;
                findPermuteUnique(nums, count + 1, path, result, visited);
                path.pop();
                visited[i] = false;
            }
        }
    }

    private static boolean isPerfect(int x, int y) {
        int r = (int)Math.sqrt(x + y);
        return r * r == x + y;
    }
    private static int isPerfect(List<List<Integer>> lists) {
        int count = 0;
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            boolean flag = true;
            for (int j = 0; j < list.size() - 1; j++) {
                if (!isPerfect(list.get(j), list.get(j + 1))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        List<List<Integer>> lists = permuteUnique(nums);
        System.out.println(isPerfect(lists));
    }
}


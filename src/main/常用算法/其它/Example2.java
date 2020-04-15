package 常用算法.其它;

import 数组.t228.SummaryRanges;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 extends ClassLoader implements Cloneable {
    private static int max = 0;
    public static void dfs(List<List<Integer>> lists, int[] weight, int sum,int start) {
        if (sum > max) {
            max = sum;
        }
        List<Integer> nowList = lists.get(start);
        int size = nowList.size();
        for (int i = 0; i < size; i++) {
            int index = nowList.get(i);
            dfs(lists, weight, sum + weight[index-1], index - 1);
        }
    }
    public static void main(String[] args) {
        //5 2 3 1 0 0
        //1 20 2 3
        //2 30 3 4 5
        //3 50 4
        //4 60
        //5 80
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int[] weight = new int[sum];
        int[] count = new int[sum];
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < sum; i++) {
            int cnt = sc.nextInt();
            count[i] = cnt;
            List<Integer> list = new ArrayList<>();
            lists.add(list);
        }
        for (int i = 0; i < sum; i++) {
            sc.nextInt();
            weight[i] = sc.nextInt();
            List<Integer> list = lists.get(i);
            for (int j = 0; j < count[i]; j++) {
                list.add(sc.nextInt());
            }
        }

        for (int i = 0; i < sum; i++) {
            dfs(lists, weight, weight[i], i);
        }
        System.out.println(max);

    }
}

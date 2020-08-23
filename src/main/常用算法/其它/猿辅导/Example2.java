package 常用算法.其它.猿辅导;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 {

    private static int[] opetate(int[] nums, int n) {
        int[] res = new int[n];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.offer(i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                list.offer(list.poll());
            } else {
                for (int j = 0; j < list.size(); j++) {
                    if (j + 1 < list.size()) {
                        int tem = list.get(j);
                        list.set(j,list.get(j+1));
                        list.set(j + 1, tem);
                    }
                    j++;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[M];
        for (int i = 0; i < M; i++) {
            nums[i] = sc.nextInt();
        }
        int[] nums2 = opetate(nums,N);
        for (int i = 0; i < nums2.length-1; i++) {
            System.out.print(nums2[i]);
            System.out.print(" ");
        }
        System.out.println(nums2[nums2.length - 1]);




    }
}

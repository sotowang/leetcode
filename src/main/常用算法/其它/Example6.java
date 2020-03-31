package 常用算法.其它;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/29 20:15
 */
public class Example6 {
    private static long calc(int n,long[] nums){
        Arrays.sort(nums);
        if(nums[n-1]<n){
            return 0;
        }else {
            nums[n-1]-=n;
            for (int i = 0; i < n-1; i++) {
                nums[i]++;
            }
        }
        return 1 + calc(n, nums);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextLong();
        }
        "aaa".contains("aa");
        System.out.println(calc(n,nums));
    }
}

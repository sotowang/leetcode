package 常用算法.其它;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    private static int solution(int[][] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums, (a, b) -> (a[1] - b[1]));
        int right = nums[0][1];
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(right>nums[i][0]){
                continue;
            }else{
                count++;
                right = nums[i][1];
            }
        }
        return nums.length-count+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        for(int i = 0; i < n; i++){
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();

        }
        int res = solution(nums);
        System.out.println(res);
    }

}

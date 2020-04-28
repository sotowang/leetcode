package 数组.数组中的重复or消失数据.面试题56_1;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/4/28 17:57
 */
public class SingleNumbers {
    public int[] singleNumbers(int[] nums) {
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            res ^= nums[i];
        }
        //第几位为1
        int index = 0;
        while((res&(1<<index)) ==0){
            index++;
        }
        int a = 0;
        int b= 0;
        for(int i=0;i<nums.length;i++){
            if(((nums[i]>>index)&1) ==1){
                a ^= nums[i];
            }else{
                b ^= nums[i];
            }
        }
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 4, 1, 4, 3, 3};
        int[] res = new SingleNumbers().singleNumbers(nums);
        Arrays.stream(res).forEach(e->{
            System.out.println(e+", ");
        });
    }
}

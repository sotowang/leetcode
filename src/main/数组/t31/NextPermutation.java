package 数组.t31;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/03 21:01
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1){
            return;
        }
        //找最大的索引nums[k]<nums[k+1]
        int k = -1;
        for(int i=nums.length-1;i> 0;i--){
            if(nums[i]>nums[i-1]){
                k = i-1;
                break;
            }
        }
        //原数组为逆序排序，翻转数组
        if(k == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        //找最大索引 nums[m]>nums[k]
        int m = -1;
        for(int i=nums.length-1;i>k;i--){
            if(nums[i]>nums[k]){
                m = i;
                break;
            }
        }
        swap(nums,k,m);
        reverse(nums,k+1,nums.length-1);
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
    private void swap(int[] nums,int i,int j){
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }

    public static void main(String[] args) {
        int[] nums3 = {
                1
        };
        new NextPermutation().nextPermutation(nums3);
        Arrays.stream(nums3).forEach(System.out::print);

        System.out.println();
        int[] nums1 = {
                1, 2, 7, 4, 3, 1
        };
        new NextPermutation().nextPermutation(nums1);
        Arrays.stream(nums1).forEach(System.out::print);

        System.out.println();


        int[] nums2 = {
                1,2,3
        };
        new NextPermutation().nextPermutation(nums2);
        Arrays.stream(nums2).forEach(System.out::print);
    }
}

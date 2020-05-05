package 排序.t324;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/05/04 18:28
 */
public class WiggleSort {
    public void wiggleSort(int[] nums) {
            if(nums == null ||nums.length == 0){
                return;
            }
            Arrays.sort(nums);
            int right = nums.length>>1;
            int mid = right;
            int left = 0;
            int pre = nums[0];
            int[] res = new int[nums.length];
            for(int i=0;i<nums.length-1;i++){
                res[i] = nums[left++];
                res[i+1] = nums[right++];
                i++;
            }
            nums = res;
        }


    public static void main(String[] args) {
        int[] nums = {1, 5, 1, 1, 6, 4};
        new WiggleSort().wiggleSort(nums);
        Arrays.stream(nums).forEach(e -> {
            System.out.print(e + ",");
        });
    }
}

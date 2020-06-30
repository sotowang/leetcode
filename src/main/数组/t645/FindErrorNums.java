package 数组.t645;

/**
 * @auther: sotowang
 * @date: 2020/06/21 14:50
 */
public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int dup = 0;
        int index = -1;
        for(int i=0;i<nums.length;i++){
            while(nums[i] != i+1){
                if(nums[nums[i]-1] == nums[i]){
                    dup = nums[i];
                    index = i+1;
                    break;
                }
                int tem = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tem;
            }

        }
        return new int[]{dup,index};
    }
}

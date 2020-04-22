package 数组.t414;

/**
 * @auther: sotowang
 * @date: 2020/4/22 14:17
 */
public class ThirdMax {
    public int thirdMax(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        boolean flag1 = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>one){
                one = nums[i];
                flag1 = true;
            }
        }
        //System.out.println(one);
        boolean flag3 = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=two && nums[i]<one){
                two = nums[i];
                flag3 = true;
            }
        }
        //System.out.println(two);
        boolean flag2 = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=three && nums[i]<two){
                three = nums[i];
                flag2 = true;
            }
        }
        return flag1 && flag2 && flag3?three:one;

    }
}

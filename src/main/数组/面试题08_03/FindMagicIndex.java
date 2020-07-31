package 数组.面试题08_03;

/**
 * @author: sotowang
 * @date: 2020/07/31 15:33
 */
public class FindMagicIndex {
    public int findMagicIndex(int[] nums) {
        for(int i=0;i<nums.length;){
            if(i == nums[i]){
                return i;
            }
            i = Math.max(i+1,nums[i]);
        }
        return -1;
    }
}

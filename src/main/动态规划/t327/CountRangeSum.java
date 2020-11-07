package 动态规划.t327;

/**
 * @author: sotowang
 * @date: 2020/11/07 19:45
 */
public class CountRangeSum {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long pre = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                long sum  = i== j? nums[j] : pre+nums[j];
                if(sum >= lower && sum <=upper){
                    count++;
                }
                pre = sum;
            }
        }
        return count;
    }
}

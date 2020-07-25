package 二分查找.分割数组的最大值.t410;

/**
 * @auther: sotowang
 * @date: 2020/07/25 20:14
 */
public class SplitArray {
    public int splitArray(int[] nums, int m) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int high = 0;
        int low = Integer.MIN_VALUE;
        for(int n:nums){
            high += n;
            if(low<n){
                low = n;
            }
        }
        while(low <high){
            int mid = low+(high-low >>1);
            int count = 1;
            int sum = 0;
            for(int n:nums){
                sum += n;
                if(sum >mid){
                    sum = n;
                    count++;
                }
            }
            if(count > m){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}

package 滑动窗口.t1438;

/**
 * @author: wangsongtao
 * @date: 2020/06/23 23:22
 */
public class LongestSubarray {
    public int longestSubarray(int[] nums, int limit) {
        int left = 0;
        int right = 0;
        int maxIndex = 0;
        int minIndex = 0;
        int res = 1;
        while(right<nums.length){
            if(Math.abs(nums[maxIndex]-nums[right])>limit){
                if(nums[right]<nums[maxIndex]){
                    while(maxIndex <right && nums[maxIndex+1] == nums[maxIndex]){
                        maxIndex++;
                    }
                    left = maxIndex+1;
                }else{
                    left = right;
                }
                minIndex = left;
                maxIndex = left;
                for(int i=left;i<=right;i++){
                    minIndex = nums[i]<nums[minIndex] ? i : minIndex;
                    maxIndex = nums[i]>nums[maxIndex] ? i : maxIndex;
                }
            }else if(Math.abs(nums[right]-nums[minIndex]) >limit){
                if(nums[right] > nums[minIndex] ){
                    while(minIndex<right && nums[minIndex+1] == nums[minIndex]){
                        minIndex++;
                    }
                    left = minIndex+1;
                }else{
                    left = right;
                }
                minIndex = left;
                maxIndex = left;
                for(int i=left;i<=right;i++){
                    minIndex = nums[i]<nums[minIndex] ? i : minIndex;
                    maxIndex = nums[i]>nums[maxIndex] ? i : maxIndex;
                }
            }else{
                res = Math.max(right - left+1,res);
                maxIndex = nums[right]>nums[maxIndex]?right:maxIndex;
                minIndex = nums[right]<nums[minIndex]?right:minIndex;
                right++;
            }
        }
        return res;
    }
}

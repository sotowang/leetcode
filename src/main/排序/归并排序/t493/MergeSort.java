package 排序.归并排序.t493;

/**
 * @author: sotowang
 * @date: 2020/11/28 19:19
 */
public class MergeSort {
    private int count = 0;
    public int reversePairs(int[] nums) {
        if(nums.length <2){
            return 0;
        }
        mergeSort(nums,0,nums.length-1);
        return  count;
    }
    private void mergeSort(int[] nums,int start,int end){
        if(start == end){
            return;
        }
        int mid = start + ((end-start)>>1);
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        int left = start;
        int right = mid +1;
        while(left<=mid && right<=end){
            if(nums[left] > 2*(long)nums[right]){
                count += mid-left+1;
                right++;
            }else{
                left++;
            }
        }
        //复原指针，合并数组
        left = start;
        right = mid+1;
        int[] tem = new int[end-start+1];
        int index = 0;
        while(left<= mid && right <=end){
            if(nums[left]<nums[right]){
                tem[index++] = nums[left++];
            }else{
                tem[index++] = nums[right++];
            }
        }
        while(left <= mid){
            tem[index++] = nums[left++];
        }
        while(right<=end){
            tem[index++] = nums[right++];
        }
        index = 0;
        for(int i=start;i<=end;i++){
            nums[i] = tem[index++];
        }
    }
}

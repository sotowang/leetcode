package 排序.归并排序.面试题51;

/**
 * @auther: sotowang
 * @date: 2020/4/24 15:16
 */
public class ReversePairs {
    private int count = 0;
    private void merge(int[] nums,int low,int high,int mid){
        int[] tem = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int index = 0;
        while(left<=mid && right<= high){
            if(nums[left]<=nums[right]){
                tem[index++] = nums[left++];
            }else{
                count+=mid-left+1;
                tem[index++] = nums[right++];
            }
        }
        while(left<=mid){
            tem[index++] = nums[left++];
        }
        while(right<=high){
            tem[index++] = nums[right++];
        }
        for(int i=0;i<tem.length;i++){
            nums[low++] = tem[i];
        }
    }
    private void mergeSort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int mid = low+((high-low)>>1);
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,high,mid);

    }
    public int reversePairs(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        mergeSort(nums,0,nums.length-1);
        return count;

    }

    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 4};
        assert new ReversePairs().reversePairs(nums) == 5;
    }
}

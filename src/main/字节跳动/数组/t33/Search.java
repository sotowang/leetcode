package 字节跳动.数组.t33;

public class Search {
    int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) >>> 1;
            if ((nums[mid] < nums[0]) ^ (nums[0] > target) ^ (nums[mid] < target)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low == high && nums[low] == target ? low : -1;
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int search2(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+((high-low)>>1);
            if(nums[mid] == target){
                return mid;
            }
            //左边有序
            if(nums[low]<=nums[mid]){
                if(target<nums[mid] && target>= nums[low]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Search().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println(new Search().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}

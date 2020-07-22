package 二分查找.剑指offer_11;

/**
 * @auther: sotowang
 * @date: 2020/07/22 19:13
 */
public class MinArray {
    public int minArray(int[] numbers) {
        if(numbers == null || numbers.length == 0){
            return 0;
        }
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            int mid = low + (high-low>>1);
            if(numbers[mid] > numbers[high]){
                low = mid+1;
            }else if(numbers[mid] <numbers[high]){
                high = mid;
            }else{
                high--;
            }
        }
        return numbers[low];
    }
}

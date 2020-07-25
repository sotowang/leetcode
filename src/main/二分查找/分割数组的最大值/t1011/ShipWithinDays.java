package 二分查找.分割数组的最大值.t1011;

/**
 * @auther: sotowang
 * @date: 2020/07/25 20:06
 */
public class ShipWithinDays {
    public int shipWithinDays(int[] weights, int D) {
        if(weights == null || weights.length == 0){
            return 0;
        }
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int weight:weights){
            if(weight>low){
                low = weight;
            }
            high += weight;
        }
        while(low<high){
            int mid = low + (high-low >>1);
            int capacity = 0;
            int day  = 1;
            for(int weight:weights){
                capacity += weight;
                if(capacity > mid){
                    day++;
                    capacity = weight;
                }
            }
            if(day > D){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}

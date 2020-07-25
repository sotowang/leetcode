package 二分查找.分割数组的最大值.t875;

/**
 * @auther: sotowang
 * @date: 2020/07/25 20:42
 */
public class MinEatingSpeed {
    public int minEatingSpeed(int[] piles, int H) {
        if(piles == null || piles.length == 0){
            return 0;
        }
        int low = 1;
        int high = 0;
        for(int pile:piles){
            if(pile>high){
                high = pile;
            }
        }
        while(low < high){
            int mid = low + (high-low >>1);
            int hour = 0;
            for(int pile:piles){
                hour += Math.ceil((double)pile/mid);
            }
            if(hour>H){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] piles = new int[]{30,11,23,4,20};
        assert new MinEatingSpeed().minEatingSpeed(piles, 5) == 30;

    }
}

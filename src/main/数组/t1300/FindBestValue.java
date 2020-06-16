package 数组.t1300;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/06/14 14:54
 */
public class FindBestValue {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            int x = (target-sum)/(arr.length-i);
            if(arr[i]>x){
                double tem = (double)(target-sum)/(arr.length-i);
                if(tem-x>0.5){
                    return x+1;
                }
                return x;
            }
            sum += arr[i];
        }
        return arr[arr.length-1];
    }
}

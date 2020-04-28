package 双指针.t658;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/4/28 22:11
 */
public class FindClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right = arr.length-1;
        int len = arr.length;
        while(len>k){
            if(x-arr[left]>arr[right]-x){
                left++;
            }else{
                right--;
            }
            len--;
        }
        for(int i=left;i<=right;i++){
            res.add(arr[i]);
        }
        return  res;

    }
}

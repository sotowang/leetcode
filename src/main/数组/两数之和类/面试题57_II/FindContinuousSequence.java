package 数组.两数之和类.面试题57_II;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/3/7 23:33
 */
public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {

        int n= target+1>>1;
        int left=n-1,right=n;
        List<int[]> resList = new ArrayList();
        int sum=left+right;
        while(left<right && left>=1){
            if(sum==target){
                int[] tem = new int[right-left+1];
                int index=0;
                for(int i=left;i<=right;i++){
                    tem[index++] = i;
                }
                resList.add(0,tem);
                sum = sum-right+left-1;
                right--;
                left--;

            }else if(sum<target){
                left--;
                sum += left;
            }else{
                sum-=right;
                right--;

            }
        }
        int[][] res = new int[resList.size()][];
        for(int i=0;i<resList.size();i++){
            res[i]= resList.get(i);
        }
        return res;
    }
}

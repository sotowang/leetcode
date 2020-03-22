package 数组.t945;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/3/22 22:47
 */
public class MinIncrementForUnique {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int res = 0;
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                continue;
            }else{
                res+= A[i-1]+1-A[i];
                A[i] = A[i-1]+1;
            }
        }
        return res;
    }
}

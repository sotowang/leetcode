package 数学.t976;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/06/07 18:49
 */
public class LargestPerimeter {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i=A.length-1;i>=2;i--){
            if(A[i]<A[i-1]+A[i-2]){
                return A[i] + A[i-1] + A[i-2];
            }
        }
        return 0;
    }
}

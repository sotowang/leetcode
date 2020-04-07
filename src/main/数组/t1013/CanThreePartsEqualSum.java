package 数组.t1013;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/4/7 15:30
 */
public class CanThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = Arrays.stream(A).sum();
        if(sum %3 != 0){
            return false;
        }
        sum /= 3;
        int tem = 0;
        int index = -1;
        //左边分
        for(int i=0;i<A.length;i++){
            tem += A[i];
            if(tem==sum){
                tem=0;
                index = i;
                break;

            }
        }
        if(index == -1){
            return false;
        }
        //右边分.中间不管
        for(int i=A.length-1;i>index+1;i--){
            tem += A[i];
            if(tem==sum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10, -10, 10, -10, 10, -10, 10, -10};
        assert new CanThreePartsEqualSum().canThreePartsEqualSum(nums) == true;
    }
}

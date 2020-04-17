package 数组.除自身以外数组的乘积.面试题66;

/**
 * @auther: sotowang
 * @date: 2020/4/17 15:32
 */
public class ConstructArr {
    public int[] constructArr(int[] a) {
        if(a.length == 0){
            return new int[]{};
        }
        int[] b = new int[a.length];
        int len = a.length;
        b[0] = 1;
        for(int i=1;i<len;i++){
            b[i] = b[i-1]*a[i-1];
        }
        int right = a[len-1];
        for(int i=len-2;i>=0;i--){
            b[i] *= right;
            right *= a[i];
        }
        return b;
    }
}

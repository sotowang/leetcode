package 数组.t922;

/**
 * @author: wangsongtao
 * @date: 2020/06/02 20:57
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int odd = 1;
        for(int i=0;i<A.length;i += 2){
            if((A[i] &1) == 1){
                while(odd <A.length && (A[odd]&1) == 1){
                    odd += 2;
                }
                if(odd<A.length){
                    int tem = A[i];
                    A[i] = A[odd];
                    A[odd] = tem;
                }
            }
        }

        return A;
    }
}

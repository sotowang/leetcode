package 排序.t1030;

import java.util.Arrays;

/**
 * @author: sotowang
 * @date: 2020/11/17 18:04
 */
public class AllCellsDistOrder {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R*C][2];
        int index = 0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                res[index][0] = i;
                res[index++][1] = j;
            }
        }
        Arrays.sort(res,(a, b)->(Math.abs(a[0]-r0) + Math.abs(a[1]-c0) -( Math.abs(b[0]-r0) + Math.abs(b[1]-c0))));
        return res;
    }
}

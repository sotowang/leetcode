package 数组.t989;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: sotowang
 * @date: 2021/01/22 17:02
 */
public class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int len = A.length;
        int lastNum =K;
        LinkedList<Integer> ret= new LinkedList<>();

        int i = len-1;
        while(i >=0 || lastNum > 0){
            if(i >= 0){
                lastNum+=A[i];
            }
            ret.addFirst(lastNum%10);
            lastNum/=10;
            i--;
        }

        return ret;
    }
}

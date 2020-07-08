package 递归.面试题16_11;

/**
 * @auther: sotowang
 * @date: 2020/07/08 21:50
 */
public class DivingBoard {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k == 0){
            return new int[]{};
        }
        if(shorter == longer){
            return new int[]{shorter*k};
        }
        int[] res = new int[k+1];
        for(int i=0;i<=k;i++){
            res[i] = longer*i+shorter*(k-i);
        }
        return res;
    }
}

package 数组.t1053;

/**
 * @author: wangsongtao
 * @date: 2020/05/24 15:22
 */
public class PrevPermOpt1 {
    /**
     处理方式为：
     第一步：从当前序列的后往前找，找到第一个降序的位置（A[i]>A[i+1]），则必存在能构造比当前小的序列。
     第二步：把A[i]后面的数字中，小于A[i]且最接近A[i]的值的数字找出来，和A[i]交换。
     为什么第一步不再往前找，因为往前找更换，会让小的值出现在高位，导致不是最大字典序。
     **/
    public int[] prevPermOpt1(int[] A) {
        for(int i= A.length-2;i>=0;i--){
            if(A[i]>A[i+1]){
                int maxIndex = i+1;
                for(int j=i+2;j<A.length;j++){
                    if(A[j]<A[i] && A[maxIndex]<A[j]){
                        maxIndex = j;
                    }
                }
                //System.out.println(i+","+maxIndex);
                swap(A,i,maxIndex);
                return A;
            }
        }
        return A;

    }
    private void swap(int[] A,int i,int j){
        int tem = A[i];
        A[i] = A[j];
        A[j] = tem;
    }
}

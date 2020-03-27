package 数组.t915;

/**
 * @auther: sotowang
 * @date: 2020/3/26 23:30
 */
public class PartitionDisjoint {
    public int partitionDisjoint(int[] A) {
        int max = A[0];
        int index = 0;
        int leftMax = A[0];
        for(int i=0;i<A.length;i++){
            max = Math.max(max,A[i]);
            if(A[i]<leftMax){
                index = i;
                leftMax = max;
            }
        }
        return index+1;
    }
}

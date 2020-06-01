package 双指针.t845;

/**
 * @author: wangsongtao
 * @date: 2020/06/01 20:04
 */
public class LongestMountain {
    public int longestMountain(int[] A) {
        if(A.length <3){
            return 0;
        }
        int max = 0;
        for(int i=1;i<A.length-1;i++){
            if(A[i]>A[i-1] && A[i]>A[i+1]){
                int left = i-1;
                int right = i+1;
                while(left>0 && A[left-1]<A[left]){
                    left--;
                }
                while(right<A.length-1 && A[right]>A[right+1]){
                    right++;
                }
                //System.out.println(left + "," + right);
                max = Math.max(max,right-left+1);

            }
        }
        return max;
    }
}

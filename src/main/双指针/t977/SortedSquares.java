package 双指针.t977;

/**
 * @author: sotowang
 * @date: 2020/10/16 22:28
 */
public class SortedSquares {

    public int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length-1;
        int[] res = new int[A.length];
        int index = A.length-1;
        while(index<A.length && left<=right){
            if(Math.abs(A[left])>Math.abs(A[right])){
                res[index] = A[left] * A[left];
                left++;
            }else{
                res[index] = A[right] * A[right];
                right--;
            }
            index--;
        }
        return res;
    }
}

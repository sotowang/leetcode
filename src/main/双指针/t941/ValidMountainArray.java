package 双指针.t941;

/**
 * @author: sotowang
 * @date: 2020/11/03 19:43
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int left = 0;
        int right = A.length-1;
        while(left<A.length-1 && A[left]<A[left+1]){
            left++;
        }
        while(right>0 && A[right] <A[right-1]){
            right--;
        }
        return left == right && left!=0 && right != A.length-1;
    }
}

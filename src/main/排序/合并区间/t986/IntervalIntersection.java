package 排序.合并区间.t986;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/4/16 20:01
 */
public class IntervalIntersection {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if(A.length == 0|| B.length ==0){
            return new int[][]{};
        }
        int lenA = A.length;
        int lenB = B.length;
        int left = 0;
        int right = 0;
        List<int[]> res= new ArrayList<>();
        while(left<lenA && right<lenB){
            int leftA = A[left][0];
            int rightA = A[left][1];
            int leftB = B[right][0];
            int rightB = B[right][1];
            if(leftA<leftB){
                if(rightA>leftB){
                    if(rightA<rightB){
                        res.add(new int[]{leftB,rightA});
                        left++;
                    }else{
                        if(rightB>=leftB){
                            res.add(new int[]{leftB,rightB});
                        }
                        right++;
                    }
                }else{
                    if(leftB<=rightA){
                        res.add(new int[]{leftB,rightA});
                    }
                    left++;
                }
            }else{
                if(rightB>leftA){
                    if(rightB<rightA){
                        res.add(new int[]{leftA,rightB});
                        right++;
                    }else{
                        if(leftA<=rightA){
                            res.add(new int[]{leftA,rightA});
                        }
                        left++;
                    }
                }else{
                    if(leftA<=rightB){
                        res.add(new int[]{leftA,rightB});
                    }
                    right++;
                }
            }
        }
        return res.toArray(new int[0][]);
    }
}

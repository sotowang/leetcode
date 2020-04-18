package 常用算法.其它;


import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example {
    private int res = 0;
    public int numWays(int n, int[][] relation, int k) {
        check(relation,n-1,k,0);
        return res;
    }
    private void check(int[][] relation,int target,int k,int count){
        if(count ==k && target==0){
            res++;
            return;
        }
        if(count>=k){
            return;
        }
        int len = relation.length;
        for(int i=0;i<len;i++){
            if(relation[i][1] == target){
                check(relation,relation[i][0],k,count+1);
            }
        }
    }

    public static void main(String[] args) {
        int[][] relation = new int[][]{{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}
                , {2, 0}, {0, 4}};
        System.out.println(new Example()
                .numWays(5, relation, 3
                ));
    }

}

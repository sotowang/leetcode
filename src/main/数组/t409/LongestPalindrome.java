package 数组.t409;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/3/22 23:33
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] cntDic = new int[58];
        for(int i=0;i<chars.length;i++){
            cntDic[chars[i]-'A']++;
        }
        int res = 0;
        Arrays.sort(cntDic);
        boolean hasOdd = false;
        for(int i=0;i<cntDic.length;i++){
            if((cntDic[i] & 1 ) == 0){
                res += cntDic[i];
            }else{
                res += cntDic[i]-1;
                hasOdd = true;
            }
        }
        return hasOdd ? res+1:res;

    }
}

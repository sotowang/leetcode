package 排序.合并区间.t763;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/4/16 18:45
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        int[][] chars = new int[26][2];
        for(int i=0;i<26;i++){
            chars[i][0]= 501;
        }
        int len = S.length();
        for(int i=0;i<len;i++){
            char c = S.charAt(i);
            if(chars[c-'a'][0] != 501){
                chars[c-'a'][1] = i;
            }else{
                chars[c-'a'][0] = i;
                chars[c-'a'][1] = i;
            }
        }
        Arrays.sort(chars,(a, b)->a[0]-b[0]);
        int left = chars[0][0];
        int right = chars[0][1];
        len = chars.length;
        List<Integer> res = new ArrayList<>();
        int i=0;
        for(;i<len-1 && chars[i][0]!=501;i++){
            if(right>=chars[i+1][0] && right<chars[i+1][1]){
                right = chars[i+1][1];
            }
            if(right<chars[i+1][0]){
                res.add(right-left+1);
                left = chars[i+1][0];
                right = chars[i+1][1];
            }
        }
        if(chars[i][0]!= 501){
            res.add(right-left+1);
        }
        return res;
    }
}

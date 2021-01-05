package 数组.t830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: sotowang
 * @date: 2021/01/05 15:27
 */
public class LargeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> resList = new ArrayList<>();
        int n = s.length();
        int start = 0;
        char tem = ' ';
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c != tem){
                if(i-start >= 3){
                    resList.add(new ArrayList<Integer>(Arrays.asList(start,i-1)));
                }
                start = i;
                tem = c;
            }
        }
        if(n-start >= 3){
            resList.add(new ArrayList<Integer>(Arrays.asList(start,n-1)));
        }
        return resList;
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(new LargeGroupPositions().largeGroupPositions(s));
    }
}

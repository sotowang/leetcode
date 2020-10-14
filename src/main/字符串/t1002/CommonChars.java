package 字符串.t1002;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sotowang
 * @date: 2020/10/14 22:36
 */
public class CommonChars {
    public List<String> commonChars(String[] A) {
        int[] count = new int[26];
        int len = A.length;
        char[] cArray = A[0].toCharArray();
        for(int i=0;i<cArray.length;i++){
            count[cArray[i]-'a']++;
        }
        for(int i=1;i<len;i++){
            cArray = A[i].toCharArray();
            int[] tem = new int[26];
            for(int j=0;j< cArray.length;j++){
                tem[cArray[j]-'a']++;
            }
            for(int j=0;j<26;j++){
                count[j] = Math.min(count[j],tem[j]);
            }
        }
        List<String> resList= new ArrayList<>();
        for(int i=0;i<26;i++){
            for(int j=0;j<count[i];j++){
                resList.add(String.valueOf((char)(i+'a')));
            }
        }
        return resList;
    }
}

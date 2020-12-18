package 字符串.t389;

/**
 * @author: sotowang
 * @date: 2020/12/18 15:49
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            arr[chars[i]-'a']++;
        }
        char[] tchars = t.toCharArray();
        for(int i=0;i<tchars.length;i++){
            if(arr[tchars[i]-'a']==0){
                return tchars[i];
            }
            arr[tchars[i]-'a']--;
        }
        return ' ';
    }
}

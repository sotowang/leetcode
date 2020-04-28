package 排序.t242;

/**
 * @auther: sotowang
 * @date: 2019/10/28 22:11
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        if(lens != lent){
            return false;
        }
        int[] dic = new int[26];
        for(int i=0;i<lens;i++){
            dic[s.charAt(i)-'a']++;
        }
        for(int i=0;i<lent;i++){
            if(dic[t.charAt(i)-'a']-- == 0){
                return false;
            }
        }
        return true;
    }
}

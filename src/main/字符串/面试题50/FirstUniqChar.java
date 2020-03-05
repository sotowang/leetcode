package 字符串.面试题50;

/**
 * @auther: sotowang
 * @date: 2020/3/5 15:56
 */
public class FirstUniqChar {
    public char firstUniqChar(String s) {
        int[] chars = new int[26];
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(chars[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}

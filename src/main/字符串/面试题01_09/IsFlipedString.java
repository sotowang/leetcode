package 字符串.面试题01_09;

/**
 * @author: wangsongtao
 * @date: 2020/05/18 20:01
 */
public class IsFlipedString {
    public boolean isFlipedString(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2){
            return false;
        }
        s2 += s2;
        return s2.contains(s1);
    }
}

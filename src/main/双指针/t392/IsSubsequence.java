package 双指针.t392;

/**
 * @author: sotowang
 * @date: 2020/07/27 15:29
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s == null || t == null ||s.length() > t.length()){
            return false;
        }
        int leftIndex  = 0,rightIndex = 0;
        while(leftIndex<s.length()){
            while(rightIndex<t.length() && t.charAt(rightIndex) != s.charAt(leftIndex)){
                rightIndex++;
            }
            if(rightIndex>=t.length()){
                return false;
            }
            rightIndex++;
            leftIndex++;
        }
        return leftIndex == s.length();
    }
}

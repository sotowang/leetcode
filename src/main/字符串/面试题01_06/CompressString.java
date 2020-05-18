package 字符串.面试题01_06;

/**
 * @auther: sotowang
 * @date: 2020/3/17 22:00
 */
public class CompressString {
    public String compressString(String S) {
        int left=0,right=0;
        int len = S.length();
        StringBuilder sb = new StringBuilder();
        while(left<len && right<len){
            while(right<len && S.charAt(right)== S.charAt(left)) right++;
            sb.append(S.charAt(left) + ""+(right-left));
            left = right;
        }
        return S.length()<=sb.length()? S:sb.toString();
    }
}

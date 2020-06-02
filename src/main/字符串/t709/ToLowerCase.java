package 字符串.t709;

/**
 * @author: wangsongtao
 * @date: 2020/06/02 21:41
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for(int i=0;i<len;i++){
            char c = str.charAt(i);
            if(c >= 'A' && c<= 'Z'){
                sb.append((char) (c+32));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

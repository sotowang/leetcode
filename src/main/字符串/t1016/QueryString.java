package 字符串.t1016;

/**
 * @author: wangsongtao
 * @date: 2020/05/26 20:25
 */
public class QueryString {
    public boolean queryString(String S, int N) {
        if(N==0){
            return true;
        }
        if(S.contains(Integer.toBinaryString(N))){
            return queryString(S,N-1);
        }else{
            return false;
        }
    }
}

package 字符串.t696;

/**
 * @auther: sotowang
 * @date: 2020/1/3 20:38
 */
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        //last记录前一数的个数
        // cur记录当前数的个数
        int last = 0;
        int cur = 1;
        int count = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)  == s.charAt(i-1)){
                cur++;
            }else{
                last = cur;
                cur = 1;

            }
            if(cur<=last){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        assert new CountBinarySubstrings().countBinarySubstrings("00110011") == 6;
        assert new CountBinarySubstrings().countBinarySubstrings("10101") == 4;
    }
}

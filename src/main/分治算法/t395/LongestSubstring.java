package 分治算法.t395;

/**
 * @auther: sotowang
 * @date: 2020/3/20 22:51
 */
public class LongestSubstring {
    public int longestSubstring(String s, int k) {
        if(s.isEmpty() || s.length()<k) return 0;
        char[] chars = s.toCharArray();
        int[] res = new int[chars.length];
        res[0] = -1;
        fillCnt(res,chars,k,0,chars.length-1);
        if (res[0] == -1) {
            return s.length();
        }
        int left = longestSubstring(s.substring(0,res[0]),k);
        int right = longestSubstring(s.substring(res[0]+1,s.length()),k);
        return left>right? left:right;

    }
    private int[] fillCnt(int[] res ,char[] s,int k,int start,int end){
        int[] map = new int[26];
        for(int i=start;i<=end;i++){
            map[s[i]-'a']++;
        }
        int index=0;
        for(int i=start;i<=end;i++){
            if(map[s[i]-'a']<k){
                res[index++] = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        assert new LongestSubstring().longestSubstring("aacbbbdc", 2) == 3;
        assert new LongestSubstring().longestSubstring("bbaaacbd", 3) == 3;
        assert new LongestSubstring().longestSubstring("ababbc", 2) == 5;
        assert new LongestSubstring().longestSubstring("aaabb", 3) == 3;
    }
}

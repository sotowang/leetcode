package 滑动窗口.t76;

/**
 * @auther: sotowang
 * @date: 2019/11/02 20:03
 */
public class MinWindow {
    public String minWindow(String s, String t) {
        if(s.isEmpty() || t.isEmpty() || s.length()<t.length()){
            return "";
        }
        int slen = s.length();
        int tlen = t.length();
        int[] tnums = new int[100];
        for(int i=0;i<tlen;i++){
            tnums[t.charAt(i)-'A']++;
        }
        int left = 0;
        int right = 0;
        int match = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;
        int[] window = new int[100];
        while(right<slen){
            char temc = s.charAt(right++);
            window[temc-'A']++;
            if(tnums[temc-'A']>0){
                if(window[temc-'A']<=tnums[temc-'A']){
                    match++;
                }
            }
            while(match == tlen){
                if(right-left<min){
                    min = right-left;
                    start = left;
                }
                char tem = s.charAt(left);
                window[tem-'A']--;
                if(tnums[tem-'A']>0 && tnums[tem-'A']>window[tem-'A']){
                    match--;
                }
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? "":s.substring(start,start+min);

    }

    public static void main(String[] args) {
        System.out.println(new MinWindow().minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(new MinWindow().minWindow("aa", "aa"));
    }
}

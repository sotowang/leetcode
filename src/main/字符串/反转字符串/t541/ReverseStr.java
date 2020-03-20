package 字符串.反转字符串.t541;

/**
 * @auther: sotowang
 * @date: 2020/3/20 16:24
 */
public class ReverseStr {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int left=0;
        while(left+k<=chars.length){
            int start = left;
            int end = left+k-1;
            while(start<end){
                swap(chars,start++,end--);
            }
            left += 2*k;
        }
        if(left<chars.length){
            int start = left;
            int end  = chars.length-1;
            while(start<end){
                swap(chars,start++,end--);
            }
        }
        return new String(chars);
    }
    private void swap(char[] chars,int i,int j){
        char tem = chars[i];
        chars[i] = chars[j];
        chars[j] = tem;
    }

    public static void main(String[] args) {
        assert new ReverseStr().reverseStr("abcdefg", 8).equals("gfedcba");

    }
}

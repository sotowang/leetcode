package 位运算.t318;

/**
 * @auther: sotowang
 * @date: 2020/3/26 22:55
 */
public class MaxProduct {
    public int maxProduct(String[] words) {
        int[] nums = new int[words.length];
        for(int i=0;i<words.length;i++){
            int len = words[i].length();
            for( int j=0;j<len;j++){
                int tem = 1<<(words[i].charAt(j)-'a');
                nums[i]  |= tem;
            }
        }
        int max = 0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if((nums[i] & nums[j])==0 ){
                    max = Math.max(max,words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}

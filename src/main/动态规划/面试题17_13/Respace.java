package 动态规划.面试题17_13;

/**
 * @auther: sotowang
 * @date: 2020/07/09 21:38
 */
public class Respace {
    public int respace(String[] dictionary, String sentence) {
        if(sentence == null || sentence.length() == 0){
            return 0;
        }
        int[] dp = new int[sentence.length()+1];
        for(int i=1;i<=sentence.length();i++){
            dp[i] = dp[i-1] +1;
            for(String word:dictionary){
                if(i>=word.length() && sentence.substring(i-word.length(),i).contains(word)){
                    dp[i] = Math.min(dp[i],dp[i-word.length()]);
                }
            }
        }
        return dp[sentence.length()];
    }

    public static void main(String[] args) {
        String[] dictionary =new String[] {"looked","just","like","her","brother"};
        String sentence = "jesslookedjustliketimherbrother";
        new Respace().respace(dictionary, sentence);
    }
}

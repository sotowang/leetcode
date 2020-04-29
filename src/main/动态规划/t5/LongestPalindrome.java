package 动态规划.t5;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return "";
        } else if (s.length() == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        //来标记i 到 j是否为回文字符串，若是则isPalidrom[i][j] = true
        boolean[][] isPalindrom = new boolean[s.length()][s.length()];
        int max = 0;
        //先把第一个值放入，否则会漏掉 ac 这种
        result.append(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            //i到i肯定为回文字符串
            isPalindrom[i][i] = true;
            for (int j = 0; j < i; j++) {
                //在 i 处的字符与在 j 处的字符相等
                //若没i-j ==1判定，则会有漏判  如 cbbd
                if (s.charAt(i) == s.charAt(j) && (isPalindrom[j + 1][i - 1] || (i - j == 1))) {
                    isPalindrom[j][i] = true;
                    if (max < i - j + 1) {
                        result.delete(0, result.length());
                        //subString截取的是beginIndex和endIndex
                        result.append(s.substring(j, j + i - j + 1));
                        max = i - j + 1;
                    }
                } else {
                    isPalindrom[j][i] = false;
                }
            }
        }
        return result.toString();
    }

    /**
     *
     * @param s
     * @return
     */
    public String longestPalindrome2(String s) {
        if(s == null || s.isEmpty()){
            return "";
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for(int i=0;i<len;i++){
            dp[i][i] = true;
        }
        int max = 1;
        String res = String.valueOf(s.charAt(0));
        for(int i=len-2;i>=0;i--){
            for(int j=i+1;j<len;j++){
                if(s.charAt(i) == s.charAt(j) && (dp[i+1][j-1] || i+1==j)){
                    dp[i][j] = true;
                    if( j-i+1>max){
                        max = j-i+1;
                        res = s.substring(i,j+1);
                    }
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(new LongestPalindrome().longestPalindrome("babad"));
//        System.out.println(new LongestPalindrome().longestPalindrome("cbbd"));
        System.out.println(new LongestPalindrome().longestPalindrome("ac"));
    }
}

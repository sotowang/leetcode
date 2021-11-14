package 字符串.t520;

/**
 * @author: sotowang
 * @date: 2021/11/14 17:58
 */
public class DetectCapitalUse {
    private boolean checkIsUpper(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public boolean detectCapitalUse(String word) {
        char[] cs = word.toCharArray();
        int upperLen = 0;
        for (int i = 0; i < cs.length; i++) {
            if (checkIsUpper(cs[i])) {
                upperLen++;
            }
        }
        if (cs.length == upperLen || (upperLen == 1 && checkIsUpper(cs[0])) ||upperLen == 0) {
            return true;
        }
        return false;
    }
}

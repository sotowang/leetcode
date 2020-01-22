package 字符串.t1324;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/1/22 21:47
 */
public class PrintVertically {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int maxLen = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= maxLen) {
                maxLen = words[i].length();
            }
        }
        ArrayList<String> res = new ArrayList<>(maxLen);
        for (int i = 0; i < maxLen; i++) {
            res.add("");
        }

        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            for (int j = 0; j < maxLen; j++) {
                String tem = res.get(j);
                if (j < len) {
                    tem += words[i].charAt(j);
                } else {
                    tem += " ";
                }
                res.set(j, tem);
            }
        }
        for (int i = 0; i < res.size(); i++) {
            res.set(i, trim(res.get(i)));
        }
        return res;
    }

    /**
     * 去除末尾空格
     * @param s
     * @return
     */
    private String trim(String s) {
        int len = s.length();
        int index = len;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                index = i;
                continue;
            } else {
                break;
            }
        }
        return s.substring(0,index);
    }

    public static void main(String[] args) {
        System.out.println(new PrintVertically().printVertically("CONTEST IS COMING"));
        System.out.println(new PrintVertically().printVertically("TO BE OR NOT TO BE"));
        System.out.println(new PrintVertically().printVertically("HOW ARE YOU"));
    }
}

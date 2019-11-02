package 滑动窗口.t30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/11/01 21:14
 */
public class FindSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        List res = new ArrayList();
        if (s == null || s.length() == 0 || words.length == 0) {
            return res;
        }
        Map<String, Integer> map = new HashMap<>();
        //将每个word放入map并计数,因可能有重复
        for (String word : words
        ) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        //每个word的长度是一样的,取第一个即可
        int wordLength = words[0].length();

        //遍历wordLenth长度,分别以其为起点
        for (int i = 0; i < wordLength; i++) {
            //left为一趟匹配起点
            int left = i;
            //right向后边游走
            int right = i;
            int count = 0;
            Map<String, Integer> temMap = new HashMap<>();
            while (right + wordLength <= s.length()) {
                String subStr = s.substring(right, right + wordLength);
                right += wordLength;
                if (map.containsKey(subStr)) {
                    temMap.put(subStr, temMap.getOrDefault(subStr, 0) + 1);
                    count++;
                    while (temMap.getOrDefault(subStr, 0) > map.getOrDefault(subStr, 0)) {
                        String subStr2 = s.substring(left, left + wordLength);
                        temMap.put(subStr2, temMap.getOrDefault(subStr2, 0) - 1);
                        count--;
                        //此时出现重复,将left右移一个word长度
                        left += wordLength;

                    }
                    if (count == words.length) {
                        res.add(left);
                    }
                } else {
                    count = 0;
                    left = right;
                    temMap.clear();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(new FindSubstring().findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}));
        System.out.println(new FindSubstring().findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
    }
}

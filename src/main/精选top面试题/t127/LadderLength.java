package 精选top面试题.t127;


import java.time.temporal.Temporal;
import java.util.*;

/**
 * @auther: sotowang
 * @date: 2019/12/08 11:16
 */
public class LadderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> begin = new HashSet<>();
        HashSet<String> end = new HashSet<>();
        HashSet<String> dict = new HashSet<>(wordList);
        begin.add(beginWord);
        end.add(endWord);
        if (!dict.contains(endWord)) {
            return 0;
        }
        int count = 1;
        while (!begin.isEmpty()) {
            count++;
            dict.removeAll(begin);
            HashSet<String> tempSet = new HashSet<>();
            for (String s : begin) {
                char[] charBegin = s.toCharArray();
                for (int i = 0; i < charBegin.length; i++) {
                    char temp = charBegin[i];
                    for (char j = 'a'; j <= 'z'; j++) {
                        if (temp == j) {
                            continue;
                        }
                        charBegin[i] = j;
                        String tempString = new String(charBegin);
                        if (dict.contains(tempString)) {
                            if (end.contains(tempString)) {
                                return count;
                            }
                            tempSet.add(tempString);
                        }
                        charBegin[i] = temp;
                    }
                }
            }
            if (tempSet.size() < end.size()) {
                begin = tempSet;
            } else {
                begin = end;
                end = tempSet;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> word = new ArrayList();
        Arrays.stream(wordList).forEach(e -> word.add(e));
        System.out.println(new LadderLength().ladderLength(beginWord, endWord, word));

    }
}

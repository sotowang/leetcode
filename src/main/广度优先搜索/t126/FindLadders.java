package 广度优先搜索.t126;

import 二分查找.t668.FindKthNumber;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/11/15 16:33
 */
public class FindLadders {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        if (wordList.contains(endWord)) {
            List<String> usedWord = new ArrayList<>();
            backTrace(beginWord, endWord, new ArrayList<>(wordList), new ArrayList<>(), res, usedWord);
        }
        return res;
    }

    private void backTrace(String beginWord,
                           String endWord,
                           ArrayList<String> dicts,
                           ArrayList<String> tempList,
                           List<List<String>> res,
                           List<String> usedWords) {
        tempList.add(beginWord);
        if (beginWord.equals(endWord)) {
            res.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < beginWord.length(); i++) {
            char[] beginChar = beginWord.toCharArray();
            for (char j = 'a'; j <= 'z'; j++) {
                char temp = beginChar[i];
                beginChar[i] = j;
                String tempStr = new String(beginChar);
                if (dicts.contains(tempStr) && !tempList.contains(tempStr)) {
                    dicts.remove(tempStr);
                    backTrace(tempStr, endWord, dicts, tempList, res, usedWords);
                    dicts.add(tempStr);
                }
                beginChar[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList(){
            {
                add("hot");
                add("dot");
                add("dog");
                add("lot");
                add("log");
                add("cog");
            }
        };
        System.out.println(new FindLadders().findLadders(beginWord, endWord, wordList));
    }
}

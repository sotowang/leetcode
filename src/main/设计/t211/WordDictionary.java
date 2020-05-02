package 设计.t211;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @auther: sotowang
 * @date: 2019/12/02 21:37
 */
public class WordDictionary {
    //length---String
    Map<Integer, Set<String>> map;
    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        map = new HashMap<>();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        if (map.getOrDefault(word.length(), null) == null) {
            Set<String> set = new HashSet<>();
            set.add(word);
            map.put(word.length(), set);
        } else {
            map.get(word.length()).add(word);
        }
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        if (map.getOrDefault(word.length(), null) == null) {
            return false;
        }
        Set<String> stringSet = map.get(word.length());
        if (stringSet.contains(word)) {
            return true;
        }
        M:for (String s : stringSet
        ) {
            if (word.length() != s.length()) {
                continue;
            }
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (word.charAt(i) != '.' && c[i] != word.charAt(i)) {
                    continue M;
                }
            }
            stringSet.add(word);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad"));
        System.out.println(wordDictionary.search("bad"));
        System.out.println(wordDictionary.search(".ad"));
        System.out.println(wordDictionary.search("b.."));
    }
}

package 字符串.t916;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/1/22 16:46
 */
public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] characters = new int[26];
        for (String s : B) {
            int[] bCount = countB(s);
           for (int i = 0; i < 26; i++) {
               characters[i] = Math.max(characters[i], bCount[i]);
            }
        }
        List<String> res = new ArrayList<>();
        search : for (String s :
                A) {
            int[] aCount = countB(s);
            for (int i = 0; i < 26; i++) {
                if (aCount[i] < characters[i]) {
                    continue search;
                }
            }
            res.add(s);
        }
        return res;


    }

    private int[] countB(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c-'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] A4 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B4 = {"ec","oc","ceo"};
        System.out.println(new WordSubsets().wordSubsets(A4, B4));

        String[] A3 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B3 = {"lo", "eo"};
        System.out.println(new WordSubsets().wordSubsets(A3, B3));

        String[] A2 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B2 = {"e", "oo"};
        System.out.println(new WordSubsets().wordSubsets(A2, B2));

        String[] A1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B1 = {"l", "e"};
        System.out.println(new WordSubsets().wordSubsets(A1, B1));

        String[] A = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = {"e", "o"};
        System.out.println(new WordSubsets().wordSubsets(A, B));
    }
}

package 回溯算法.t126;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/11/15 16:33
 */
public class FindLadders {
    private int minSize = Integer.MAX_VALUE;
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> temRes = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        if (wordList.contains(endWord)) {
            backTrace(beginWord, endWord, new ArrayList<>(wordList), new ArrayList<>(), temRes);
        }
        for (List<String> list :
                temRes) {
            if (list.size() == minSize) {
                res.add(list);
            }
        }
        return res;
    }

    private void backTrace(String beginWord,
                           String endWord,
                           ArrayList<String> dicts,
                           ArrayList<String> tempList,
                           List<List<String>> res
                           ) {
        if (beginWord.equals(endWord)) {
            tempList.add(endWord);
            minSize = Math.min(tempList.size(), minSize);
            res.add(new ArrayList<>(tempList));
            tempList.remove(endWord);
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
                    tempList.add(beginWord);
                    backTrace(tempStr, endWord, dicts, tempList, res);
                    dicts.add(tempStr);
                    tempList.remove(beginWord);
                }
                beginChar[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        /**
         * "qa"
         * "sq"
         * ["si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"]
         */
        String beginWord1= "qa";
        String endWord1 = "sq";
        List<String> list = Arrays.asList(new String[]{"si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm", "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow", "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm", "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye"});
        List<String> wordList1 = new ArrayList(list);
        System.out.println(new FindLadders().findLadders(beginWord1, endWord1, wordList1));
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

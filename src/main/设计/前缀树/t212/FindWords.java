package 设计.前缀树.t212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/3/1 21:23
 */
public class FindWords {

    private int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        HashSet<String> wordList = new HashSet(Arrays.asList(words));
        Trie trie = new Trie();
        for (int i = 0; i < words.length; i++) {
            trie.insert(words[i]);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                backTrace(board, i, j, res,
                        new StringBuilder(), wordList,
                        new boolean[board.length][board[0].length],trie);
            }
        }
        return res;
    }

    private boolean backTrace(char[][] board, int row, int col,
                              List<String> res, StringBuilder sb,
                              HashSet<String> wordList,
                              boolean[][] isVisited, Trie trie) {
        if (res.size() == wordList.size() || (row >= board.length && col >= board.length)) {
            return true;
        }
        int m, n;
        isVisited[row][col] = true;
        sb.append(board[row][col]);
        if (trie.startsWith(sb.toString())) {
            if (wordList.contains(sb.toString()) && !res.contains(sb.toString())) {
                res.add(sb.toString());
            }
            for (int i = 0; i < dirs.length; i++) {
                m = row + dirs[i][0];
                n = col + dirs[i][1];
                if (m >= 0 && n >= 0 && m < board.length && n < board[0].length
                        && !isVisited[m][n]) {
                    isVisited[m][n] = true;
                    backTrace(board, m, n, res, sb, wordList, isVisited, trie);
                    isVisited[m][n] = false;
                }
            }
        }
        sb.delete(sb.length() - 1, sb.length());
        isVisited[row][col] = false;
        return true;
    }

    public class  TrieNode{
        TrieNode[] links;
        boolean end;
        public TrieNode() {
            this.links = new TrieNode[26];
        }

        public void put(char c, TrieNode root) {
            links[c - 'a'] = root;
        }

        public TrieNode get(char c) {
            return links[c - 'a'];
        }

        public void setEnd() {
            this.end = true;
        }

        public boolean isEnd() {
            return end;
        }

        public boolean containsKey(char c) {
            return links[c - 'a'] != null;
        }
    }

    public  class Trie {
        TrieNode root;
        public Trie() {
            this.root = new TrieNode();
        }

        public TrieNode searchPrefix(String s) {
            TrieNode node = root;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!node.containsKey(c)) {
                    return null;
                }
                node = node.get(c);
            }
            return node;
        }

        public void insert(String s) {
            TrieNode node = root;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!node.containsKey(c)) {
                    node.put(c, new TrieNode());
                }
                node = node.get(c);
            }
            node.setEnd();
        }

        public boolean startsWith(String s) {
            return searchPrefix(s) != null;
        }
    }

    public static void main(String[] args) {
        char[][] board1 = new char[][]{
                {'a', 'a'}
        };
        String[] words1 = new String[]{"aaa"};
        System.out.println(new FindWords().findWords(board1, words1));
        char[][] board = new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = new String[]{"oath", "pea", "rain", "eat"};
        System.out.println(new FindWords().findWords(board, words));
    }
}

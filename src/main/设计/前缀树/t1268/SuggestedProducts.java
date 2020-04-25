package 设计.前缀树.t1268;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/4/25 15:35
 */
public class SuggestedProducts {
    class TrieNode{
        private final int size = 26;
        private TrieNode[] links;
        private boolean isEnd;
        private int count;
        private String word;
        public TrieNode(){
            links = new TrieNode[size];
        }
        private boolean containksKey(char c){
            return links[c-'a']!= null;
        }
        private void put(char c){
            links[c-'a'] = new TrieNode();
        }
        private TrieNode get(char c){
            return links[c-'a'];
        }
        public void setEnd(){
            this.isEnd = true;
        }
        public boolean isEnd(){
            return isEnd;
        }
        public void setWord(String word){
            this.word = word;
        }
        public String getWord(){
            return this.word;
        }
        public void setCount(){
            this.count++;
        }
        public int getCount(){
            return count;
        }
        public TrieNode[] getLinks(){
            return this.links;
        }
    }
    class Trie{
        TrieNode root;
        public Trie(){
            root = new TrieNode();
        }
        public void insert(String word){
            TrieNode node = root;
            int len = word.length();
            for(int i=0;i<len;i++){
                char c = word.charAt(i);
                if(!node.containksKey(c)){
                    node.put(c);
                }
                node = node.get(c);
            }
            node.setEnd();
            node.setCount();
            node.setWord(word);
        }
        public boolean hasPrefix(String word,List<String> list){
            TrieNode node = root;
            int len = word.length();
            for(int i=0;i<len;i++){
                char c = word.charAt(i);
                if(!node.containksKey(c)){
                    return false;
                }
                node = node.get(c);
            }
            //别忘了自身的node判断
            if(node.isEnd()){
                int count = node.getCount();
                for(int i=0;i<count && list.size()<3;i++){
                    list.add(node.getWord());
                }
            }
            collect(node,list);
            return true;
        }
        public void collect(TrieNode node,List<String> list){
            int size = list.size();
            if(size>=3){
                return;
            }
            TrieNode[] links = node.getLinks();
            for(TrieNode link:links){
                if(null == link){
                    continue;
                }
                if(!link.isEnd()){
                    collect(link,list);
                }else{
                    int count = link.getCount();
                    for(int i=0;i<count && list.size()<3;i++){
                        list.add(link.getWord());
                        collect(link,list);
                    }
                }
            }
        }
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> lists = new ArrayList<>();
        List<String> temList = new ArrayList<>();
        Trie trie = new Trie();
        for(String s:products){
            trie.insert(s);
        }
        int len = searchWord.length();
        for(int i=0;i<len;i++){
            String subs = searchWord.substring(0,i+1);
            trie.hasPrefix(subs,temList);
            lists.add(new ArrayList<>(temList));
            temList.clear();
        }
        return lists;
    }

    public static void main(String[] args) {
        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        System.out.println(new SuggestedProducts().suggestedProducts(products, searchWord));
    }
}

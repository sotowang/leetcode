package 并查集.t1202;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/5/7 14:39
 */
public class SmallestStringWithSwaps {
    public class UnionFind{
        private int[] parents;
        private int[] size;
        public UnionFind(int n){
            parents = new int[n];
            size = new int[n];
            for(int i=0;i<n;i++){
                size[i] = 1;
                parents[i] = i;
            }
        }
        public void union(int i,int j){
            int parentI = find(i);
            int parentJ = find(j);
            if(parentI == parentJ){
                return;
            }
            if(size[parentI]<size[parentJ]){
                size[parentI]+= size[parentJ];
                parents[parentJ] = parentI;
            }else{
                size[parentJ] += size[parentI];
                parents[parentI] = parentJ;
            }
        }
        public int find(int node){
            while(node!= parents[node]){
                node = parents[parents[node]];
            }
            return node;
        }
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int len = s.length();
        UnionFind uf = new UnionFind(len);
        for(List<Integer> pair:pairs){
            uf.union(pair.get(0),pair.get(1));
        }
        Map<Integer, LinkedList<Character>> map = new HashMap<>();
        Map<Integer,Integer> parentMap = new HashMap<>();
        for(int i=0;i<len;i++){
            int parentI = uf.find(i);
            map.computeIfAbsent(parentI,v->new LinkedList<>()).add(s.charAt(i));
            parentMap.put(i,parentI);
        }
        HashSet<Integer> set = new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:parentMap.entrySet()){
            if(set.add(entry.getValue())){
                Collections.sort(map.get(entry.getValue()));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++){
            LinkedList list = map.get(parentMap.get(i));
            sb.append(list.getFirst());
            list.pollFirst();
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        List<List<Integer>> pairs2 = new ArrayList();
        pairs2.add(Arrays.asList(0, 3));
        pairs2.add(Arrays.asList(1, 2));
        pairs2.add(Arrays.asList(0, 2));
        assert new SmallestStringWithSwaps().smallestStringWithSwaps("dcab", pairs2).equals("abcd");
        List<List<Integer>> pairs1 = new ArrayList();
        pairs1.add(Arrays.asList(0, 3));
        pairs1.add(Arrays.asList(1, 2));
        assert new SmallestStringWithSwaps().smallestStringWithSwaps("dcab", pairs1).equals("bacd");

    }
}

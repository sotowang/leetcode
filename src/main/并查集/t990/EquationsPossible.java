package 并查集.t990;

/**
 * @author: wangsongtao
 * @date: 2020/06/08 20:21
 */
public class EquationsPossible {
    public class UnionFind{
        private int[] parents;
        public UnionFind(int n){
            this.parents = new int[n];
            for(int i=0;i<n;i++){
                parents[i] = i;
            }
        }
        public void union(int a,int  b){
            int parentA = find(a);
            int parentB = find(b);
            if(parentA == parentB){
                return;
            }
            parents[parentB] = parentA;
        }
        public int find(int a){
            while(a!=parents[a]){
                a = parents[parents[a]];
            }
            return a;
        }
    }
    public boolean equationsPossible(String[] equations) {
        UnionFind uf = new UnionFind(26);
        for(int i=0;i<equations.length;i++){
            int a = equations[i].charAt(0)-'a';
            int b = equations[i].charAt(3)-'a';
            if(equations[i].charAt(1) == '='){
                uf.union(a,b);
            }
        }
        for(int i=0;i<equations.length;i++){
            if(equations[i].charAt(1) != '='){
                int a = equations[i].charAt(0)-'a';
                int b = equations[i].charAt(3)-'a';
                if(uf.find(a) == uf.find(b)){
                    return false;
                }
            }
        }
        return true;
    }
}

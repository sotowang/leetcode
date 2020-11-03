package 并查集.t684;

/**
 * @author: sotowang
 * @date: 2020/09/17 16:26
 */
public class FindRedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        for(int i=edges.length-1;i>=0;i--){
            if(!isCircle(edges,i)){
                return edges[i];
            }
        }
        return new int[]{};
    }

    private boolean isCircle(int[][] edges,int removeIndex){
        UnionFind uf = new UnionFind(edges.length+1);
        for(int i=0;i<edges.length;i++){
            if(i == removeIndex){
                continue;
            }
            //若两点在一个并查集中，则构成了环
            if(!uf.union(edges[i][0],edges[i][1])){
                return true;
            }
        }
        return false;
    }
    class UnionFind{
        int[] parent;
        public UnionFind(int n){
            this.parent = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = i;
            }
        }
        public boolean union(int x,int y){
            int rootX = find(x);
            int rootY = find(y);
            if(rootX == rootY){
                return false;
            }
            parent[rootX] = rootY;
            return true;
        }
        public int find(int x){
            while(parent[x] != x){
                x = parent[parent[x]];
            }
            return x;
        }
    }
}

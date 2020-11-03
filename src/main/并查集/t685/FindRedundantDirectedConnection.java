package 并查集.t685;

/**
 * @author: sotowang
 * @date: 2020/09/17 16:05
 */
public class FindRedundantDirectedConnection {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int[] inDegree = new int[edges.length+1];
        //入度
        for(int[] edge:edges){
            inDegree[edge[1]]++;
        }
        //删除入度为2的边，若不构成环，则为所求
        for(int i=edges.length-1;i>=0;i--){
            if(inDegree[edges[i][1]] == 2 && !isCircle(edges,i)){
                return edges[i];
            }
        }
        //删除入度为1的边，若不构成环，则为所求
        for(int i=edges.length-1;i>=0;i--){
            if(inDegree[edges[i][1]] == 1 && !isCircle(edges,i)){
                return edges[i];
            }
        }
        return new int[]{};
    }
    private boolean isCircle(int[][] edges,int removeIndex){
        UnionFind uf = new UnionFind(edges.length+1);
        for(int i=0;i<edges.length;i++){
            if(i==removeIndex){
                continue;
            }
            //合并失败，有环
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
        public int find(int x){
            while(parent[x] != x){
                x= parent[parent[x]];
            }
            return x;
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
    }
}

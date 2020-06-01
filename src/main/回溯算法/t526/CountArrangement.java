package 回溯算法.t526;

/**
 * @author: wangsongtao
 * @date: 2020/06/01 20:35
 */
public class CountArrangement {
    private int count = 0;
    public int countArrangement(int N) {
        boolean[] visited = new boolean[16];
        permute(N,visited,0);
        return count;
    }
    private void permute(int N, boolean[] visited,int size){
        if(N == size){
            count++;
            return;
        }
        for(int i=1;i<=N;i++){
            if(!visited[i]){
                visited[i] = true;
                if((size +1)%i == 0 || i%(size+1) == 0){
                    permute(N,visited,size+1);
                }
                visited[i] = false;
            }
        }
    }
}

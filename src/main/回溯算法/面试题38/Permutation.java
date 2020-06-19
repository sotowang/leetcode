package 回溯算法.面试题38;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @auther: sotowang
 * @date: 2020/06/13 13:42
 */
public class Permutation {
    private Set<String> set=  new HashSet<>();
    public String[] permutation(String s) {
        int n = s.length();
        boolean[] visited = new boole125an[n];
        backTrace(s,visited,"",n);
        //System.out.print(list);
        return set.toArray(new String[0]);
    }
    private void backTrace(String s,boolean[] visited, String tem,int len){
        if(len == tem.length()){
            set.add(tem);
            return;
        }
        for(int i=0;i<len;i++){
            if(!visited[i]){
                visited[i] = true;
                backTrace(s,visited,tem + s.charAt(i),len);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Arrays.stream(new Permutation().permutation("dkjphedy")).forEach(System.out::println);
    }
}

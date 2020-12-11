package 队列.t649;

import java.util.LinkedList;

/**
 * @author: sotowang
 * @date: 2020/12/11 19:29
 */
public class PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        LinkedList<Integer> RList = new LinkedList<>();
        LinkedList<Integer> DList = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(senate.charAt(i) == 'R'){
                RList.offer(i);
            }else{
                DList.offer(i);
            }
        }
        while(!RList.isEmpty() && !DList.isEmpty()){
            int Rindex = RList.poll();
            int Dindex = DList.poll();
            if(Rindex<Dindex){
                RList.offer(Rindex+n);
            }else{
                DList.offer(Dindex+n);
            }
        }
        return RList.isEmpty()?"Dire":"Radiant";
    }
}

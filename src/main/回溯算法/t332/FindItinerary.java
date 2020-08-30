package 回溯算法.t332;

import java.util.*;

/**
 * @author: sotowang
 * @date: 2020/08/28 14:46
 */
public class FindItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,PriorityQueue<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(List<String> strs :tickets){
            if(!map.containsKey(strs.get(0))){
                map.put(strs.get(0),new PriorityQueue<String>());
            }
            if(!list.contains(strs.get(0))){
                list.add(strs.get(0));
            }
            if(!list.contains(strs.get(1))){
                list.add(strs.get(1));
            }
            PriorityQueue<String> queue = map.get(strs.get(0));
            queue.offer(strs.get(1));
        }
        LinkedList<String> resList = new LinkedList<>();
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if(dfs(map,list.get(i),resList)){
                return resList;
            }
        }
        return resList;

    }
    private boolean dfs(Map<String,PriorityQueue<String>> map,String start,LinkedList<String> list){
        list.offer(start);
        if(list.size() == map.size()){
            return true;
        }
        PriorityQueue<String> queue = map.get(start);
        if(queue == null || queue.isEmpty()){
            list.pollLast();
            return false;
        }
        while(!queue.isEmpty()){
            String s = queue.poll();
            if(dfs(map,s,list)){
                return true;
            }
        }
        list.pollLast();
        return false;
    }

    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC", "LHR"));
        tickets.add(Arrays.asList("JFK", "MUC"));
        tickets.add(Arrays.asList("SFO", "SJC"));
        tickets.add(Arrays.asList("LHR", "SFO"));
        System.out.println(new FindItinerary().findItinerary(tickets));
    }
}

package 回溯算法.t93;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddress {

    public List<String> restoreIpAddresses(String s) {
        List<String> resList= new ArrayList<>();
        backTrace(s,0,resList,new LinkedList());
        return resList;
    }
    private void backTrace(String s,int start,List<String> resList,LinkedList<Integer> temList){
        if(start == s.length() && temList.size() == 4){
            String res = temList.get(3) + "." + temList.get(2) + "." + temList.get(1) + "." + temList.get(0);
            resList.add(res);
            return;
        }else if (s.length() - start > (4 - temList.size()) * 3 || s.length() - start < 4 - temList.size()) {
            return;
        }
        for(int i=start+1;i<start+4 && i<=s.length();i++){
            String res = s.substring(start,i);
            if(res.startsWith("0") && res.length() > 1){
                break;
            }
            int tem = Integer.valueOf(res);
            temList.push(tem);
            if(tem>=0 && tem<=255 && temList.size() <=4){
                backTrace(s,i,resList,temList);
            }
            temList.pop();
        }

    }

    public static void main(String[] args) {
        //["19.216.80.0","192.16.80.0","192.168.0.0"]
        System.out.println(new RestoreIpAddress().restoreIpAddresses("222222222222"));
        //["19.216.80.0","192.16.80.0","192.168.0.0"]
        System.out.println(new RestoreIpAddress().restoreIpAddresses("19216800"));
        //["0.0.0.0"]
        System.out.println(new RestoreIpAddress().restoreIpAddresses("0000"));

        //["255.255.11.135", "255.255.111.35"]
        System.out.println(new RestoreIpAddress().restoreIpAddresses("25525511135"));
    }
}

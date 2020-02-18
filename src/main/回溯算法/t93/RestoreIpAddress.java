package 回溯算法.t93;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddress {

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backTrace(s, 0, new ArrayList<>(), res);
        return res;
    }

    private boolean backTrace(String s, int start, ArrayList<String> tem, List<String> res) {
        if (start >= s.length() && tem.size() == 4) {
            String ip = tem.get(0) + "." + tem.get(1) + "." + tem.get(2) + "." + tem.get(3);
            res.add(ip);
            return true;
        } else if (((4 - tem.size()) * 3 < s.length() - start) ||(s.length() - start < (4 - tem.size()))) {
            return false;
        }

        for (int i = start + 1; i < start + 4 && i <= s.length(); i++) {
            String sub = s.substring(start, i);
            if (sub.startsWith("0") && sub.length() > 1) {
                break;
            }
            tem.add(sub);
            if (Integer.valueOf(sub) <= 255 && tem.size() <= 4) {
                backTrace(s, i, tem, res);
            }
            tem.remove(tem.size() - 1);
        }
        return false;
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

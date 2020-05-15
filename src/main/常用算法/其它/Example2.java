package 常用算法.其它;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 extends ClassLoader  {
//5a 12 5b ba 34 5b bb 88 05 5a 75 cd bb 62 5a 34 cd 78 cc da fb 06 5a

    private static String check(String s) {
        int lens = s.length();
        int start = -1;
        for (int i = 0; i < lens-1; i++) {
            if (s.charAt(i) == '5' && s.charAt(i + 1) == 'a') {
                start = i;
                break;
            }
        }
        s = s.substring(start, lens);
        if(start == -1){
            return "";
        }
        start = -1;
        for (int i = s.length()-1; i >0 ; i--) {
            if (s.charAt(i) == 'a' && s.charAt(i - 1) == '5') {
                start = i;
                break;
            }
        }
        s = s.substring(0, start + 1);
        String[] ss = s.split("5a");
        StringBuilder res = new StringBuilder();
        StringBuilder tem = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            if(ss[i].isEmpty() || ss[i].equals(" ")){
                continue;
            }
            String[] sub = ss[i].trim().split(" ");
            int len = Integer.valueOf(sub[sub.length - 1], 16);
            int count = 0;
            for (int j = 0; j < sub.length - 1; j++) {
                if ((sub[j].equals("5b") && sub[j + 1].equals("ba")) || sub[j].equals("5b") && sub[j + 1].equals("bb")) {
                    count++;
                    tem.append(sub[j]).append(" ").append(sub[j+1]).append(" ");
                    j++;
                } else{
                    tem.append(sub[j]).append(" ");
                    count++;
                }
            }
            if (count == len) {
                res.append("5a ").append(tem.toString()).append(sub[sub.length - 1]).append(" ");
            }
            tem.delete(0, tem.length());
        }
        if (!res.toString().equals("")) {
            res.append("5a");
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(check("5a 5b 5a"));
        System.out.println(check("5a 12 5b ba 34 5a bb 88 05 5a 75 cd bb 62 5a 34 cd 78 cc da fb 06 5a"));
        System.out.println(check("12 5b ba 34 5b bb 88 05 5a 75 cd bb 62 5a 34 cd 78 cc da fb 06"));
    }
}

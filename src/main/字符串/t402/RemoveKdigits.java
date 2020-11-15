package 字符串.t402;

/**
 * @author: sotowang
 * @date: 2020/11/15 21:44
 */
public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        if(k == num.length()){
            return "0";
        }
        while(k-->0){
            int start = 0;
            while(start<num.length()-1 && num.charAt(start)<=num.charAt(start+1)){
                start++;
            }
            num = num.substring(0,start) + num.substring(start+1);
        }
        //System.out.print(num);
        int start = 0;
        while(start < num.length() && num.charAt(start) == '0'){
            start++;
        }
        num = num.substring(start);
        return num.length() == 0? "0" : num;
    }

    public static void main(String[] args) {
        String s = "1173";
        int k = 2;
        System.out.println(new RemoveKdigits().removeKdigits(s, k));
    }
}
